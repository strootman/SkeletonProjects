function Skeleton(){var P='',xb='" for "gwt:onLoadErrorFn"',vb='" for "gwt:onPropertyErrorFn"',ib='"><\/script>',Z='#',Kc='.cache.html',_='/',lb='//',kc='3CDECDABAB75E500D86FB75B3BB276EC',Ec='4526AEC2A3CF00CAEA3F1736B6F9DC58',Fc='4B9598145674978F48398F6F1CE77C23',Gc='5BCE6C60190A2C892BB20B4B43B140D9',Hc='7062D292D34799EC26828D2E89886D5C',Jc=':',lc=':1',mc=':10',nc=':11',oc=':12',pc=':13',qc=':14',rc=':15',sc=':16',tc=':17',uc=':18',vc=':19',wc=':2',xc=':3',yc=':4',zc=':5',Ac=':6',Bc=':7',Cc=':8',Dc=':9',pb='::',Sc='<script defer="defer">Skeleton.onInjectionDone(\'Skeleton\')<\/script>',hb='<script id="',sb='=',$='?',ub='Bad handler "',Ic='C2BA1968203A9A5086D45D1D0887A86B',Rc='DOMContentLoaded',jb='SCRIPT',Q='Skeleton',eb='Skeleton.nocache.js',ob='Skeleton::',gb='__gwt_marker_Skeleton',Xb='adobeair',Yb='air',kb='base',cb='baseUrl',T='begin',S='bootstrap',Db='chrome',bb='clear.cache.gif',rb='content',Y='end',Tb='gecko',Vb='gecko1_8',Wb='gecko1_9',U='gwt.codesvr=',V='gwt.hosted=',W='gwt.hybrid',Lc='gwt/standard/standard.css',wb='gwt:onLoadErrorFn',tb='gwt:onPropertyErrorFn',qb='gwt:property',Cb='gxt.user.agent',Qc='head',ic='hosted.html?Skeleton',Pc='href',Gb='ie10',Mb='ie6',Kb='ie7',Ib='ie8',Hb='ie9',yb='iframe',ab='img',zb="javascript:''",Mc='link',ec='linux',hc='loadExternalRefs',dc='mac',cc='mac os x',bc='macintosh',mb='meta',Bb='moduleRequested',X='moduleStartup',Fb='msie',Lb='msie 6',Jb='msie 7',nb='name',Eb='opera',Ab='position:absolute;width:0;height:0;border:none',Nc='rel',Ub='rv:1.8',Nb='safari',Pb='safari3',Rb='safari4',Sb='safari5',db='script',jc='selectingPermutation',R='startup',Oc='stylesheet',fb='undefined',_b='unknown',Zb='user.agent',ac='user.agent.os',Ob='version/3',Qb='version/4',$b='webkit',gc='win32',fc='windows';var m=window,n=document,o=m.__gwtStatsEvent?function(a){return m.__gwtStatsEvent(a)}:null,p=m.__gwtStatsSessionId?m.__gwtStatsSessionId:null,q,r,s,t=P,u={},v=[],w=[],x=[],y=0,z,A;o&&o({moduleName:Q,sessionId:p,subSystem:R,evtGroup:S,millis:(new Date).getTime(),type:T});if(!m.__gwt_stylesLoaded){m.__gwt_stylesLoaded={}}if(!m.__gwt_scriptsLoaded){m.__gwt_scriptsLoaded={}}function B(){var b=false;try{var c=m.location.search;return (c.indexOf(U)!=-1||(c.indexOf(V)!=-1||m.external&&m.external.gwtOnLoad))&&c.indexOf(W)==-1}catch(a){}B=function(){return b};return b}
function C(){if(q&&r){var b=n.getElementById(Q);var c=b.contentWindow;if(B()){c.__gwt_getProperty=function(a){return H(a)}}Skeleton=null;c.gwtOnLoad(z,Q,t,y);o&&o({moduleName:Q,sessionId:p,subSystem:R,evtGroup:X,millis:(new Date).getTime(),type:Y})}}
function D(){function e(a){var b=a.lastIndexOf(Z);if(b==-1){b=a.length}var c=a.indexOf($);if(c==-1){c=a.length}var d=a.lastIndexOf(_,Math.min(c,b));return d>=0?a.substring(0,d+1):P}
function f(a){if(a.match(/^\w+:\/\//)){}else{var b=n.createElement(ab);b.src=a+bb;a=e(b.src)}return a}
function g(){var a=F(cb);if(a!=null){return a}return P}
function h(){var a=n.getElementsByTagName(db);for(var b=0;b<a.length;++b){if(a[b].src.indexOf(eb)!=-1){return e(a[b].src)}}return P}
function i(){var a;if(typeof isBodyLoaded==fb||!isBodyLoaded()){var b=gb;var c;n.write(hb+b+ib);c=n.getElementById(b);a=c&&c.previousSibling;while(a&&a.tagName!=jb){a=a.previousSibling}if(c){c.parentNode.removeChild(c)}if(a&&a.src){return e(a.src)}}return P}
function j(){var a=n.getElementsByTagName(kb);if(a.length>0){return a[a.length-1].href}return P}
function k(){var a=n.location;return a.href==a.protocol+lb+a.host+a.pathname+a.search+a.hash}
var l=g();if(l==P){l=h()}if(l==P){l=i()}if(l==P){l=j()}if(l==P&&k()){l=e(n.location.href)}l=f(l);t=l;return l}
function E(){var b=document.getElementsByTagName(mb);for(var c=0,d=b.length;c<d;++c){var e=b[c],f=e.getAttribute(nb),g;if(f){f=f.replace(ob,P);if(f.indexOf(pb)>=0){continue}if(f==qb){g=e.getAttribute(rb);if(g){var h,i=g.indexOf(sb);if(i>=0){f=g.substring(0,i);h=g.substring(i+1)}else{f=g;h=P}u[f]=h}}else if(f==tb){g=e.getAttribute(rb);if(g){try{A=eval(g)}catch(a){alert(ub+g+vb)}}}else if(f==wb){g=e.getAttribute(rb);if(g){try{z=eval(g)}catch(a){alert(ub+g+xb)}}}}}}
function F(a){var b=u[a];return b==null?null:b}
function G(a,b){var c=x;for(var d=0,e=a.length-1;d<e;++d){c=c[a[d]]||(c[a[d]]=[])}c[a[e]]=b}
function H(a){var b=w[a](),c=v[a];if(b in c){return b}var d=[];for(var e in c){d[c[e]]=e}if(A){A(a,d,b)}throw null}
var I;function J(){if(!I){I=true;var a=n.createElement(yb);a.src=zb;a.id=Q;a.style.cssText=Ab;a.tabIndex=-1;n.body.appendChild(a);o&&o({moduleName:Q,sessionId:p,subSystem:R,evtGroup:X,millis:(new Date).getTime(),type:Bb});a.contentWindow.location.replace(t+L)}}
w[Cb]=function(){var a=navigator.userAgent.toLowerCase();if(a.indexOf(Db)!=-1)return Db;if(a.indexOf(Eb)!=-1)return Eb;if(a.indexOf(Fb)!=-1){if(n.documentMode>=10)return Gb;if(n.documentMode>=9)return Hb;if(n.documentMode>=8)return Ib;if(a.indexOf(Jb)!=-1)return Kb;if(a.indexOf(Lb)!=-1)return Mb;return Gb}if(a.indexOf(Nb)!=-1){if(a.indexOf(Ob)!=-1)return Pb;if(a.indexOf(Qb)!=-1)return Rb;return Sb}if(a.indexOf(Tb)!=-1){if(a.indexOf(Ub)!=-1)return Vb;return Wb}if(a.indexOf(Xb)!=-1)return Yb;return null};v[Cb]={air:0,chrome:1,gecko1_8:2,gecko1_9:3,ie10:4,ie6:5,ie7:6,ie8:7,ie9:8,opera:9,safari3:10,safari4:11,safari5:12};w[Zb]=function(){var b=navigator.userAgent.toLowerCase();var c=function(a){return parseInt(a[1])*1000+parseInt(a[2])};if(function(){return b.indexOf(Eb)!=-1}())return Eb;if(function(){return b.indexOf($b)!=-1}())return Nb;if(function(){return b.indexOf(Fb)!=-1&&n.documentMode>=9}())return Hb;if(function(){return b.indexOf(Fb)!=-1&&n.documentMode>=8}())return Ib;if(function(){var a=/msie ([0-9]+)\.([0-9]+)/.exec(b);if(a&&a.length==3)return c(a)>=6000}())return Mb;if(function(){return b.indexOf(Tb)!=-1}())return Vb;return _b};v[Zb]={gecko1_8:0,ie6:1,ie8:2,ie9:3,opera:4,safari:5};w[ac]=function(){var a=m.navigator.userAgent.toLowerCase();if(a.indexOf(bc)!=-1||a.indexOf(cc)!=-1){return dc}if(a.indexOf(ec)!=-1){return ec}if(a.indexOf(fc)!=-1||a.indexOf(gc)!=-1){return fc}return _b};v[ac]={linux:0,mac:1,unknown:2,windows:3};Skeleton.onScriptLoad=function(){if(I){r=true;C()}};Skeleton.onInjectionDone=function(){q=true;o&&o({moduleName:Q,sessionId:p,subSystem:R,evtGroup:hc,millis:(new Date).getTime(),type:Y});C()};E();D();var K;var L;if(B()){if(m.external&&(m.external.initModule&&m.external.initModule(Q))){m.location.reload();return}L=ic;K=P}o&&o({moduleName:Q,sessionId:p,subSystem:R,evtGroup:S,millis:(new Date).getTime(),type:jc});if(!B()){try{G([Yb,Nb,ec],kc);G([Yb,Nb,dc],kc+lc);G([Pb,Nb,_b],kc+mc);G([Pb,Nb,fc],kc+nc);G([Rb,Nb,ec],kc+oc);G([Rb,Nb,dc],kc+pc);G([Rb,Nb,_b],kc+qc);G([Rb,Nb,fc],kc+rc);G([Sb,Nb,ec],kc+sc);G([Sb,Nb,dc],kc+tc);G([Sb,Nb,_b],kc+uc);G([Sb,Nb,fc],kc+vc);G([Yb,Nb,_b],kc+wc);G([Yb,Nb,fc],kc+xc);G([Db,Nb,ec],kc+yc);G([Db,Nb,dc],kc+zc);G([Db,Nb,_b],kc+Ac);G([Db,Nb,fc],kc+Bc);G([Pb,Nb,ec],kc+Cc);G([Pb,Nb,dc],kc+Dc);G([Vb,Vb,ec],Ec);G([Vb,Vb,dc],Ec+lc);G([Vb,Vb,_b],Ec+wc);G([Vb,Vb,fc],Ec+xc);G([Wb,Vb,ec],Ec+yc);G([Wb,Vb,dc],Ec+zc);G([Wb,Vb,_b],Ec+Ac);G([Wb,Vb,fc],Ec+Bc);G([Gb,Hb,ec],Fc);G([Gb,Hb,dc],Fc+lc);G([Gb,Hb,_b],Fc+wc);G([Gb,Hb,fc],Fc+xc);G([Hb,Hb,ec],Fc+yc);G([Hb,Hb,dc],Fc+zc);G([Hb,Hb,_b],Fc+Ac);G([Hb,Hb,fc],Fc+Bc);G([Ib,Ib,ec],Gc);G([Ib,Ib,dc],Gc+lc);G([Ib,Ib,_b],Gc+wc);G([Ib,Ib,fc],Gc+xc);G([Eb,Eb,ec],Hc);G([Eb,Eb,dc],Hc+lc);G([Eb,Eb,_b],Hc+wc);G([Eb,Eb,fc],Hc+xc);G([Mb,Mb,ec],Ic);G([Mb,Mb,dc],Ic+lc);G([Mb,Mb,_b],Ic+wc);G([Mb,Mb,fc],Ic+xc);G([Kb,Mb,ec],Ic+yc);G([Kb,Mb,dc],Ic+zc);G([Kb,Mb,_b],Ic+Ac);G([Kb,Mb,fc],Ic+Bc);K=x[H(Cb)][H(Zb)][H(ac)];var M=K.indexOf(Jc);if(M!=-1){y=Number(K.substring(M+1));K=K.substring(0,M)}L=K+Kc}catch(a){return}}var N;function O(){if(!s){s=true;if(!__gwt_stylesLoaded[Lc]){var a=n.createElement(Mc);__gwt_stylesLoaded[Lc]=a;a.setAttribute(Nc,Oc);a.setAttribute(Pc,t+Lc);n.getElementsByTagName(Qc)[0].appendChild(a)}C();if(n.removeEventListener){n.removeEventListener(Rc,O,false)}if(N){clearInterval(N)}}}
if(n.addEventListener){n.addEventListener(Rc,function(){J();O()},false)}var N=setInterval(function(){if(/loaded|complete/.test(n.readyState)){J();O()}},50);o&&o({moduleName:Q,sessionId:p,subSystem:R,evtGroup:S,millis:(new Date).getTime(),type:Y});o&&o({moduleName:Q,sessionId:p,subSystem:R,evtGroup:hc,millis:(new Date).getTime(),type:T});n.write(Sc)}
Skeleton();