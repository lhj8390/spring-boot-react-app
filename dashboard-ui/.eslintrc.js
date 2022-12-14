module.exports = {
	'env': {
		'node': true,
		'browser': true,
		'commonjs': true,
		'es6': true
	},
	'extends': ['eslint:recommended', 'plugin:react/recommended'],
	'parserOptions': {
		'ecmaFeatures': {
			'jsx': true
		},
		'ecmaVersion': 2018,
		'sourceType': 'module'
	},
	'plugins': [
		'react'
	],
	'rules': {
		'indent': [
			'error',
			'space'
		],
		'quotes': [
			'error',
			'single'
		],
		'semi': [
			'error',
			'always'
		],
	}
};