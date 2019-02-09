import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

public class main {

	public static int main(String args[]) {
		ApiContextInitializer.init();
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
		Bot bot = new Bot();
		
		try {
			telegramBotsApi.registerBot(bot);
		}catch(TelegramApiRequestException e) {
			e.printStackTrace();
		}
		
	}
	
}
