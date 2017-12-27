# moyasar-java
Moyasar Java Wrapper  

## Documentation

See the [Java API docs](https://moyasar.com/docs/api/?java).

## Requirements

* JDK 8 or above.

### Libraries

These libraries are included in the repository.

* Gson
* Converter-Gson
* Logging-interceptor
* Okhttp3
* Okio
* Retrofit 2

## Usage

``` java
import com.moyasar.main.*;
import com.moyasar.bean.*;

Moyasar moyasar = new Moyasar("Your API Key");

try {
	moyasar.Payment.list(1);
	// Your logic ..
}
catch(MoyasarException e) {
	System.out.println(e.getStatusCode());
	System.out.println(e.getMessage());
	System.out.println(e.getErrorType());
	System.out.println(e.getErrors());
}
```

## Development

To use this wrapper make sure to include the required libraries.

