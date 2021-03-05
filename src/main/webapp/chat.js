/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import React, {Compnent} from 'react';
class Chat extends Cmponent {
    constructor(props){
        suer(props);
    }
    componentDidMount(){
        (function(d, m){
        var kommunicateSettings = 
            {"appId":"16867492604ea4d7b8d8379f94555fae1","popupWidget":true,"automaticChatOpenOnNavigation":true};
        var s = document.createElement("script"); s.type = "text/javascript"; s.async = true;
        s.src = "https://widget.kommunicate.io/v2/kommunicate.app";
        var h = document.getElementsByTagName("head")[0]; h.appendChild(s);
        window.kommunicate = m; m._globals = kommunicateSettings;
    })(document, window.kommunicate || {});
    }
    render(){
        return(
                <div></div>
        )
    }
}
export default Chat;


