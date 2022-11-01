import React from 'react';
import ReactDOM from 'react-dom/client';
import { Provider } from 'react-redux';
import {BrowserRouter as Router} from 'react-router-dom';
import {createBrowserHistory  as createHistory} from 'history';
import store from './store/store';
import App from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
	<Provider store={store()}>
		<Router history={createHistory()}>
			<App />
		</Router>
	</Provider>
);