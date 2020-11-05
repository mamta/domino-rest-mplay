package com.mamta.sl.client;

import java.util.logging.Logger;

import org.dominokit.domino.rest.DominoRestConfig;
import org.dominokit.domino.rest.shared.request.Fail;
import org.dominokit.domino.rest.shared.request.FailedResponseBean;
import org.dominokit.domino.rest.shared.request.Success;

import com.google.gwt.core.client.EntryPoint;
import com.mamta.sl.client.services.UserServiceClientFactory;
import com.mamta.sl.client.utils.WebUtils;
import com.mamta.sl.shared.User;

public class App implements EntryPoint {

	private static final Logger logger = Logger.getLogger(App.class.getName());

	@Override
	public void onModuleLoad() {
		DominoRestConfig.initDefaults();
		DominoRestConfig.getInstance().setDefaultServiceRoot(WebUtils.getWebAppUrl() + "webapi/sl/");

		getMessage((String response) -> {

			logger.info("response " + response);

		}, (FailedResponseBean failedResponse) -> showWarning(failedResponse));
		
		getUser((User response) -> {

			logger.info("response " + response);

		}, (FailedResponseBean failedResponse) -> showWarning(failedResponse));

	}

	private void showWarning(FailedResponseBean failedResponse) {
		logger.info("status code " + failedResponse.getStatusCode());
	}

	public static final void getMessage(Success<String> response, Fail fail) {

		logger.info("getMessage");

		UserServiceClientFactory.INSTANCE.getMessage().onSuccess(response).onFailed(fail).send();

	}
	
	public static final void getUser(Success<User> response, Fail fail) {

		logger.info("getUser");

		UserServiceClientFactory.INSTANCE.getUser().onSuccess(response).onFailed(fail).send();

	}
}