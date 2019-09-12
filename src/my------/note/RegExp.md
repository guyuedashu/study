#####RegExp
    RegExp 对象用于存储检索模式。
    
    通过 new 关键词来定义 RegExp 对象。以下代码定义了名为 patt1 的 RegExp 对象，其模式是 "e"：
    
    var patt1=new RegExp("e");

    ^ 和 [^指定字符串] 之间的区别:
    
    ^ 指的是匹配字符串开始的位置
    
    有三个方法：：
  
    修饰符	描述
    i	执行对大小写不敏感的匹配。
    g	执行全局匹配（查找所有匹配而非在找到第一个匹配后停止）。
    m	执行多行匹配。
    
#####方法  
    test() 方法检索字符串中的指定值。返回值是 true 或 false。
    
    var regex = new RegExp('我'); console.log(regex.test('wu hau 我的天下'))
    返回  true
####
    exec() 方法检索字符串中的指定值。返回值是被找到的值。如果没有发现匹配，则返回 null。
    
    var regex = new RegExp('我'); 
    console.log(regex.exec('wu我 hau 我的天下'))  ["我", index: 2, input: "wu我 hau 我的天下", groups: undefined]
    返回 给定字符串  我
    
####
    compile() 方法用于改变 RegExp。
    
    compile() 既可以改变检索模式，也可以添加或删除第二个参数。
        var regex = new RegExp('H'); 
        console.log(regex.test('wu hau 我的天下')); 
        
        regex.compile('H','i'); console.log(regex.test('wu hau 我的天下'))
    VM653:1 false
    VM653:1 true
####属性
    global	        RegExp 对象是否具有标志 g。
    ignoreCase	RegExp 对象是否具有标志 i。
    lastIndex	一个整数，标示开始下一次匹配的字符位置。     重要事项：不具有标志 g 和不表示全局模式的 RegExp 对象不能使用 lastIndex 属性。
    multiline	RegExp 对象是否具有标志 m。	 使用 multiline 属性来检测正则表达式是否具有标志 m。
                    返回true和false
    source	正则表达式的源文本。 不包括修饰符
        var regex = new RegExp('Hsdads'); 
        console.log(regex.test('wu hau 我的天下'));  console.log(regex.source)
        VM1130:2 false
        VM1130:2 Hsdads
#####字符串方法
    replace() 用于在字符串中用一些字符替换另一些字符，或替换一个与正则表达式匹配的子串。
    var str = '打A卡啦dsasdsa';console.log( str.replace(/a/g,'A'));
     打A卡啦dsAsdsA
##
    search() 用于检索字符串中指定的子字符串，或检索与正则表达式相匹配的子字符串，
    并返回子串的起始位置。
    
    var str = '打A卡啦dsasdsa';console.log( str.search(/a/g));
    6