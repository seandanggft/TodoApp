# TodoApp Assessment

Write an Android app that displays a list of items fetched from an API endpoint.

The app should have a LazyColumn (Jetpack Compose) or RecyclerView that displays the list of items.

API: https://jsonplaceholder.typicode.com/todos


## Requirements

- The API endpoint should return a JSON object that contains an array of items, each item with an id and a title field.
- Fetch and parse the JSON response (use Retrofit, Gson or any similar libraries)


## Nice-to-have

- The app should handle errors gracefully and display an appropriate message to the user if an error occurs.
- Use Kotlin Coroutines to handle async
- Have Unit Tests
