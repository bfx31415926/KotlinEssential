package myPage58

// 1. Определим свой Result-обобщённый sealed-класс
sealed class Result<out T>

data class Success<T>(val data: T) : Result<T>()
data class Failure(val throwable: Throwable) : Result<Nothing>()

// 2. Пример данных
data class Message(val text: String)

// 3. Функция обработки результата
fun handleResponse(response: Result<List<Message>>) {
    when (response) {
        is Success<*> -> showMessages(response.data as List<Message>)
        is Failure -> showError(response.throwable)
    }
}

// 4. Вспомогательные функции
fun showMessages(messages: List<Message>) {
    println("Сообщения:")
    messages.forEach { println("- ${it.text}") }
}

fun showError(throwable: Throwable) {
    println("Ошибка: ${throwable.message}")
}

// 5. Главная функция — пример использования
fun main() {
    // Успешный случай
    val successResponse: Result<List<Message>> = Success(
        listOf(
            Message("Привет!"),
            Message("Как дела?")
        )
    )
    handleResponse(successResponse)

    println() // пустая строка
    // Ошибочный случай
    val failureResponse: Result<List<Message>> = Failure(
        IllegalArgumentException("Сервер недоступен")
    )
    handleResponse(failureResponse)
}
/*
Сообщения:
- Привет!
- Как дела?

Ошибка: Сервер недоступен
 */