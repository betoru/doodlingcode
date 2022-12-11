/**
 * 자바스크립트 실행환경
 * 모든 브라우저는 자바스크립트 엔진을 내장하고 있다. 자바스크립트 엔진은 자바스크립트 코드를 해석하고 실행하는 역할을 한다.
 * 브라우저 뿐만 아니라 Node.js도 자바스크립트 엔진을 내장하고 있다. 따라서 js는 브라우저 환경 또는 Node.js 환경에서 실행된다.
 * 단, 브라우저와 Node.js는 용도가 다르다.
 * 브라우저는 JS, Html, CSS를 실행해 웹페이지를 브라우저 화면에 렌더링하는 역할을 한다.
 * Node.js는 브라우저 외부에서 JS 실행환경을 제공하는 것이 주된 목적이다. (e.g.서버 구축 역할)
 * FYI
 *    브라우저의 자바스크립트 엔진은 ECMAScript 사양을 준수하고, Node.js의 자바스크립트 엔진은 Node.js만의 확장 사양을 추가로 지원한다.
 *    브라우저의 자바스크립트 엔진은 크게 2가지로 나뉜다.
 *    1. V8 엔진
 *    2. SpiderMonkey 엔진
 *    V8 엔진은 구글에서 만든 자바스크립트 엔진이다.
 *    V8 엔진은 구글 크롬 브라우저에서 사용되고 있다.
 *    V8 엔진은 ECMAScript 사양을 준수하고, 구글 크롬 브라우저에서만 사용할 수 있다.
 *    SpiderMonkey 엔진은 모질라에서 만든 자바스크립트 엔진이다.
 *    SpiderMonkey 엔진은 파이어폭스 브라우저에서 사용되고 있다.
 *    SpiderMonkey 엔진은 ECMAScript 사양을 준수하고, 파이어폭스 브라우저에서만 사용할 수 있다.
 *    Node.js는 V8 엔진을 기반으로 만들어졌다.
 *    Node.js는 V8 엔진을 사용하고, ECMAScript 사양을 준수하면서 Node.js만의 확장 사양을 추가로 지원한다.
 *    Node.js는 브라우저가 아니기 때문에 브라우저에서 사용할 수 없는 기능을 지원한다.
 *    Node.js는 브라우저에서 사용할 수 없는 기능을 지원하기 위해 브라우저에서 사용할 수 없는 기능을 제외한 ECMAScript 사양을 준수한다.
 *
 *    브라우저는 ECMAScript와 DOM, BOM, Canvas, XMLHttpRequest, fetch, requestAnimation Frame, SVG, Web Storage, Web Component, Web SQL Database, Web Workers, Web Sockets, Geolocation, WebRTC 와 같은 Web API를 지원한다.
 *    @see https://developer.mozilla.org/ko/docs/Web/API
 *    Node.js는 클라이언트 사이드 Web API를 지원하지 않고 ECMA Script와 Node.js 고유의 API를 지원한다.
 *    @see https://nodejs.org/dist/latest-v12.x/docs/api/
 */

