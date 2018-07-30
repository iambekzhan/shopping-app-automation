package steps;

import java.util.Locale;
import java.util.Map;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import models.User;

public class DataTableConfigure implements TypeRegistryConfigurer {

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}
	
	@Override
	public void configureTypeRegistry(TypeRegistry typeRegister) {
		typeRegister.defineDataTableType(new DataTableType(User.class, new TableEntryTransformer<User>() {

			@Override
			public User transform(Map<String, String> entry) throws Throwable {
				return new User(entry.get("title"), entry.get("first name"), entry.get("last name"), entry.get("phone number"));
			}
		}));
	}

}
