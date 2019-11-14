
Demo for https://stackoverflow.com/questions/58805033/using-spring-boot-2-oauth-client-and-resourceserver-in-the-same-context

* Start the application `mvnw spring-boot:run`
* Try the API: `curl -D- http://localhost:8080/api/call`
* Try the static HTML: `curl -D- http://localhost:8080/index.html`

Desired behaviour:

API should return **401**. Static HTML should return **302** redirect to gitlab authorization

You should never see the real HTML or API response without a valid token.
You should never get a 401 when requesting the HTML.
You should never get a 302 when calling the API..

