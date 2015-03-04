package com.lidroid.xutils.util; class OtherUtils { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/util/OtherUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "OtherUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final STRING_BUFFER_LENGTH:I = 0x64
a=0;// 
a=0;// .field private static trustAllCerts:[Ljavax/net/ssl/TrustManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/OtherUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getCharsetFromHttpRequest(Lorg/apache/http/client/methods/HttpRequestBase;)Ljava/nio/charset/Charset;
a=0;//     .locals 10
a=0;//     .param p0, "request"    # Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     #v5=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/nio/charset/Charset;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 75
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 76
a=0;//     .local v0, "charsetName":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     const-string v6, "Content-Type"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/apache/http/client/methods/HttpRequestBase;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 77
a=0;//     .local v3, "header":Lorg/apache/http/Header;
a=0;//     #v3=(Reference,Lorg/apache/http/Header;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 78
a=0;//     invoke-interface {v3}, Lorg/apache/http/Header;->getElements()[Lorg/apache/http/HeaderElement;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,[Lorg/apache/http/HeaderElement;);
a=0;//     array-length v8, v7
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Integer);v9=(Conflicted);
a=0;//     if-lt v6, v8, :cond_4
a=0;// 
a=0;//     .line 87
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 88
a=0;//     .local v4, "isSupportedCharset":Z
a=0;//     #v4=(Null);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 90
a=0;//     :try_start_0
a=0;//     invoke-static {v0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 95
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v4=(Boolean);v6=(Conflicted);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/nio/charset/Charset;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     .end local v4    # "isSupportedCharset":Z
a=0;//     :cond_4
a=0;//     #v0=(Null);v4=(Uninit);v5=(Null);v6=(Integer);v7=(Reference,[Lorg/apache/http/HeaderElement;);v8=(Integer);
a=0;//     aget-object v2, v7, v6
a=0;// 
a=0;//     .line 79
a=0;//     .local v2, "element":Lorg/apache/http/HeaderElement;
a=0;//     #v2=(Null);
a=0;//     const-string v9, "charset"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v9}, Lorg/apache/http/HeaderElement;->getParameterByName(Ljava/lang/String;)Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 80
a=0;//     .local v1, "charsetPair":Lorg/apache/http/NameValuePair;
a=0;//     #v1=(Reference,Lorg/apache/http/NameValuePair;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 81
a=0;//     invoke-interface {v1}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 78
a=0;//     :cond_5
a=0;//     #v0=(Null);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 91
a=0;//     .end local v1    # "charsetPair":Lorg/apache/http/NameValuePair;
a=0;//     .end local v2    # "element":Lorg/apache/http/HeaderElement;
a=0;//     .restart local v4    # "isSupportedCharset":Z
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v4=(Null);v6=(Boolean);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static getCurrentStackTraceElement()Ljava/lang/StackTraceElement;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getFileNameFromHttpResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p0, "response"    # Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 57
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 58
a=0;//     .local v3, "result":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     const-string v4, "Content-Disposition"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0, v4}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 59
a=0;//     .local v2, "header":Lorg/apache/http/Header;
a=0;//     #v2=(Reference,Lorg/apache/http/Header;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     invoke-interface {v2}, Lorg/apache/http/Header;->getElements()[Lorg/apache/http/HeaderElement;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[Lorg/apache/http/HeaderElement;);
a=0;//     array-length v6, v5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v7=(Conflicted);
a=0;//     if-ge v4, v6, :cond_0
a=0;// 
a=0;//     aget-object v0, v5, v4
a=0;// 
a=0;//     .line 61
a=0;//     .local v0, "element":Lorg/apache/http/HeaderElement;
a=0;//     #v0=(Null);
a=0;//     const-string v7, "filename"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v7}, Lorg/apache/http/HeaderElement;->getParameterByName(Ljava/lang/String;)Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 62
a=0;//     .local v1, "fileNamePair":Lorg/apache/http/NameValuePair;
a=0;//     #v1=(Reference,Lorg/apache/http/NameValuePair;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 63
a=0;//     invoke-interface {v1}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 65
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v3, v4, v5}, Lcom/lidroid/xutils/util/CharsetUtils;->toCharset(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 66
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 60
a=0;//     :cond_2
a=0;//     #v3=(Null);v4=(Integer);v5=(Reference,[Lorg/apache/http/HeaderElement;);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getSubString(Ljava/lang/String;II)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;//     .param p1, "start"    # I
a=0;//     .param p2, "end"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static isSupportRange(Lorg/apache/http/HttpResponse;)Z
a=0;//     .locals 4
a=0;//     .param p0, "response"    # Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 42
a=0;//     #v2=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 43
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);
a=0;//     const-string v3, "Accept-Ranges"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0, v3}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "header":Lorg/apache/http/Header;
a=0;//     #v0=(Reference,Lorg/apache/http/Header;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 45
a=0;//     const-string v2, "bytes"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :cond_2
a=0;//     #v2=(Null);
a=0;//     const-string v3, "Content-Range"
a=0;// 
a=0;//     invoke-interface {p0, v3}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 48
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 50
a=0;//     .local v1, "value":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v3, "bytes"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static sizeOfString(Ljava/lang/String;Ljava/lang/String;)J
a=0;//     .locals 8
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/UnsupportedEncodingException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 102
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(LongLo);v4=(LongHi);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-wide v3
a=0;// 
a=0;//     .line 104
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);v7=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 105
a=0;//     .local v2, "len":I
a=0;//     #v2=(Integer);
a=0;//     const/16 v6, 0x64
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ge v2, v6, :cond_2
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[B);
a=0;//     array-length v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v3, v6
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_2
a=0;//     #v3=(Uninit);v4=(Uninit);v6=(PosByte);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     .line 109
a=0;//     .local v3, "size":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     add-int/lit8 v0, v1, 0x64
a=0;// 
a=0;//     .line 111
a=0;//     .local v0, "end":I
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v2, :cond_3
a=0;// 
a=0;//     .line 112
a=0;//     :goto_2
a=0;//     invoke-static {p0, v1, v0}, Lcom/lidroid/xutils/util/OtherUtils;->getSubString(Ljava/lang/String;II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 113
a=0;//     .local v5, "temp":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[B);
a=0;//     array-length v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v6, v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     add-long/2addr v3, v6
a=0;// 
a=0;//     .line 109
a=0;//     add-int/lit8 v1, v1, 0x64
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v5    # "temp":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 111
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static trustAllSSLForHttpsURLConnection()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/OtherUtils;->trustAllCerts:[Ljavax/net/ssl/TrustManager;
a=0;// 
a=0;//     #v2=(Reference,[Ljavax/net/ssl/TrustManager;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljavax/net/ssl/TrustManager;
a=0;// 
a=0;//     #v2=(Reference,[Ljavax/net/ssl/TrustManager;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Lcom/lidroid/xutils/util/OtherUtils$1;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/lidroid/xutils/util/OtherUtils$1;);
a=0;//     invoke-direct {v4}, Lcom/lidroid/xutils/util/OtherUtils$1;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/util/OtherUtils$1;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     sput-object v2, Lcom/lidroid/xutils/util/OtherUtils;->trustAllCerts:[Ljavax/net/ssl/TrustManager;
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v2, "TLS"
a=0;// 
a=0;//     invoke-static {v2}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 152
a=0;//     .local v1, "sslContext":Ljavax/net/ssl/SSLContext;
a=0;//     #v1=(Reference,Ljavax/net/ssl/SSLContext;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v3, Lcom/lidroid/xutils/util/OtherUtils;->trustAllCerts:[Ljavax/net/ssl/TrustManager;
a=0;// 
a=0;//     #v3=(Reference,[Ljavax/net/ssl/TrustManager;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljavax/net/ssl/SSLSocketFactory;);
a=0;//     invoke-static {v2}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 157
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v2, Lorg/apache/http/conn/ssl/SSLSocketFactory;->ALLOW_ALL_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;
a=0;// 
a=0;//     invoke-static {v2}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// 
a=0;//     .line 154
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 155
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/lidroid/xutils/util/LogUtils;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
