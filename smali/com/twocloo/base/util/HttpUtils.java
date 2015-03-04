package com.twocloo.base.util; class HttpUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/HttpUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final COMMON_CONNECT_TIMEOUT:I = 0x1770
a=0;// 
a=0;// .field public static final COMMON_SO_TIMEOUT:I = 0x7530
a=0;// 
a=0;// .field public static final COMMON_TIMEOUT:I = 0x7d0
a=0;// 
a=0;// .field public static final ENCODING:Ljava/lang/String; = "utf-8"
a=0;// 
a=0;// .field public static final GZIP:Ljava/lang/String; = "gzip"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/HttpUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static assemblyCookie(Ljava/util/List;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/cookie/Cookie;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     .local p0, "cookies":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/cookie/Cookie;>;"
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 159
a=0;//     .local v1, "sbu":Ljava/lang/StringBuffer;
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 166
a=0;//     :cond_0
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 159
a=0;//     :cond_1
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/cookie/Cookie;
a=0;// 
a=0;//     .line 160
a=0;//     .local v0, "cookie":Lorg/apache/http/cookie/Cookie;
a=0;//     invoke-interface {v0}, Lorg/apache/http/cookie/Cookie;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/cookie/Cookie;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ";"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static assemblyCookieMap(Ljava/util/List;)Ljava/util/Map;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/cookie/Cookie;",
a=0;//             ">;)",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     .local p0, "cookies":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/cookie/Cookie;>;"
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-interface {p0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     .line 172
a=0;//     .local v1, "cookieMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     return-object v1
a=0;// 
a=0;//     .line 172
a=0;//     :cond_0
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/cookie/Cookie;
a=0;// 
a=0;//     .line 173
a=0;//     .local v0, "cookie":Lorg/apache/http/cookie/Cookie;
a=0;//     invoke-interface {v0}, Lorg/apache/http/cookie/Cookie;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/cookie/Cookie;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static assemblyHeader(Ljava/util/Map;)[Lorg/apache/http/Header;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)[",
a=0;//             "Lorg/apache/http/Header;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     .local p0, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     invoke-interface {p0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v0, v3, [Lorg/apache/http/message/BasicHeader;
a=0;// 
a=0;//     .line 147
a=0;//     .local v0, "allHeader":[Lorg/apache/http/Header;
a=0;//     #v0=(Reference,[Lorg/apache/http/message/BasicHeader;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 148
a=0;//     .local v1, "i":I
a=0;//     #v1=(Null);
a=0;//     invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     return-object v0
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 149
a=0;//     .local v2, "str":Ljava/lang/String;
a=0;//     new-instance v5, Lorg/apache/http/message/BasicHeader;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/message/BasicHeader;);
a=0;//     invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v5, v2, v3}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/message/BasicHeader;);
a=0;//     aput-object v5, v0, v1
a=0;// 
a=0;//     .line 150
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static assemblyParameter(Ljava/util/Map;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     .local p0, "parameters":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     .line 181
a=0;//     .local v0, "para":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 182
a=0;//     .local v1, "str":Ljava/lang/String;
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "="
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "&"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static closeStream(Ljava/io/Closeable;)V
a=0;//     .locals 2
a=0;//     .param p0, "is"    # Ljava/io/Closeable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 286
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 293
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-interface {p0}, Ljava/io/Closeable;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 290
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 291
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static execute(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lcom/twocloo/base/http/HttpResult;
a=0;//     .locals 10
a=0;//     .param p0, "client"    # Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;//     .param p1, "request"    # Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     .line 127
a=0;//     .local v6, "startTime":J
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {p0, p1}, Lorg/apache/http/impl/client/AbstractHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 128
a=0;//     .local v4, "response":Lorg/apache/http/HttpResponse;
a=0;//     #v4=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     new-instance v5, Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/base/http/HttpResult;);
a=0;//     invoke-direct {v5}, Lcom/twocloo/base/http/HttpResult;-><init>()V
a=0;// 
a=0;//     .line 130
a=0;//     .local v5, "result":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v5=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v5, v8}, Lcom/twocloo/base/http/HttpResult;->setStatusCode(I)V
a=0;// 
a=0;//     .line 131
a=0;//     invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,[Lorg/apache/http/Header;);
a=0;//     invoke-virtual {v5, v8}, Lcom/twocloo/base/http/HttpResult;->setHeaders([Lorg/apache/http/Header;)V
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {p0}, Lorg/apache/http/impl/client/AbstractHttpClient;->getCookieStore()Lorg/apache/http/client/CookieStore;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {v8}, Lorg/apache/http/client/CookieStore;->getCookies()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/util/HttpUtils;->assemblyCookie(Ljava/util/List;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Lcom/twocloo/base/http/HttpResult;->setCookie(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {p0}, Lorg/apache/http/impl/client/AbstractHttpClient;->getCookieStore()Lorg/apache/http/client/CookieStore;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {v8}, Lorg/apache/http/client/CookieStore;->getCookies()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/util/HttpUtils;->assemblyCookieMap(Ljava/util/List;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Lcom/twocloo/base/http/HttpResult;->setCookieMap(Ljava/util/Map;)V
a=0;// 
a=0;//     .line 134
a=0;//     invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Lcom/twocloo/base/http/HttpResult;->setHttpEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {v5, p1}, Lcom/twocloo/base/http/HttpResult;->setRequest(Lorg/apache/http/client/methods/HttpUriRequest;)V
a=0;// 
a=0;//     .line 137
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 138
a=0;//     .local v2, "endTime":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v0, v2, v6
a=0;// 
a=0;//     .line 140
a=0;//     .local v0, "duration":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/net/URI;);
a=0;//     invoke-virtual {v9}, Ljava/net/URI;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "|"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     return-object v5
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/twocloo/base/http/HttpResult;
a=0;//     .locals 1
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Lcom/twocloo/base/http/HttpResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     .local p1, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .local p2, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1, p2, v0}, Lcom/twocloo/base/util/HttpUtils;->get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;//     .locals 4
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p3, "encoding"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/twocloo/base/http/HttpResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     .local p1, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .local p2, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 96
a=0;//     .local v0, "client":Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v1, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v1, p0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 100
a=0;//     .local v1, "get":Lorg/apache/http/client/methods/HttpGet;
a=0;//     #v1=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/HttpUtils;->assemblyHeader(Ljava/util/Map;)[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/apache/http/client/methods/HttpGet;->setHeaders([Lorg/apache/http/Header;)V
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/HttpUtils;->execute(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 96
a=0;//     .end local v1    # "get":Lorg/apache/http/client/methods/HttpGet;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p2}, Lcom/twocloo/base/util/HttpUtils;->assemblyParameter(Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lorg/apache/http/impl/client/DefaultHttpClient;)Lcom/twocloo/base/http/HttpResult;
a=0;//     .locals 3
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p3, "encoding"    # Ljava/lang/String;
a=0;//     .param p4, "client"    # Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lorg/apache/http/impl/client/DefaultHttpClient;",
a=0;//             ")",
a=0;//             "Lcom/twocloo/base/http/HttpResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     .local p1, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .local p2, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 116
a=0;//     new-instance v0, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v0, p0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 118
a=0;//     .local v0, "get":Lorg/apache/http/client/methods/HttpGet;
a=0;//     #v0=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/HttpUtils;->assemblyHeader(Ljava/util/Map;)[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpGet;->setHeaders([Lorg/apache/http/Header;)V
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     invoke-static {p4, v0}, Lcom/twocloo/base/util/HttpUtils;->execute(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 114
a=0;//     .end local v0    # "get":Lorg/apache/http/client/methods/HttpGet;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {p2}, Lcom/twocloo/base/util/HttpUtils;->assemblyParameter(Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static loadImage(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 8
a=0;//     .param p0, "imageUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 192
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     .local v1, "httpProvider":Lcom/twocloo/base/http/HttpProvider;
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 196
a=0;//     .local v3, "is":Ljava/io/InputStream;
a=0;//     #v3=(Null);
a=0;//     const/16 v5, 0x7530
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/16 v6, 0x7530
a=0;// 
a=0;//     :try_start_0
a=0;//     #v6=(PosShort);
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/base/http/HttpProvider;->newInstance(II)Lcom/twocloo/base/http/HttpProvider;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 197
a=0;//     #v1=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-string v7, "utf-8"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0, v5, v6, v7}, Lcom/twocloo/base/http/HttpProvider;->get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 199
a=0;//     .local v2, "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v2=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/base/http/HttpResult;->getStatusCode()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0x194
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     if-ne v5, v6, :cond_1
a=0;// 
a=0;//     .line 208
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 210
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 214
a=0;//     .end local v2    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/io/InputStream;);v4=(Reference,Landroid/graphics/Bitmap;);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 202
a=0;//     .restart local v2    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v2=(Reference,Lcom/twocloo/base/http/HttpResult;);v3=(Null);v4=(Null);v5=(Integer);v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/base/http/HttpResult;->getHttpEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v5}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 204
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 208
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 210
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 205
a=0;//     .end local v2    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Null);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 206
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 208
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 210
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 207
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 208
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 210
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 212
a=0;//     :cond_2
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public static loadImage(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 13
a=0;//     .param p0, "picPath"    # Ljava/lang/String;
a=0;//     .param p1, "imageUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 222
a=0;//     #v9=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 223
a=0;//     .local v3, "httpProvider":Lcom/twocloo/base/http/HttpProvider;
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 224
a=0;//     .local v5, "is":Ljava/io/InputStream;
a=0;//     #v5=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 228
a=0;//     .local v7, "out":Ljava/io/OutputStream;
a=0;//     #v7=(Null);
a=0;//     const/16 v10, 0x7530
a=0;// 
a=0;//     #v10=(PosShort);
a=0;//     const/16 v11, 0x7530
a=0;// 
a=0;//     :try_start_0
a=0;//     #v11=(PosShort);
a=0;//     invoke-static {v10, v11}, Lcom/twocloo/base/http/HttpProvider;->newInstance(II)Lcom/twocloo/base/http/HttpProvider;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 229
a=0;//     #v3=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const-string v12, "utf-8"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, p1, v10, v11, v12}, Lcom/twocloo/base/http/HttpProvider;->get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 231
a=0;//     .local v4, "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v4=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/base/http/HttpResult;->getStatusCode()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/16 v11, 0x194
a=0;// 
a=0;//     #v11=(PosShort);
a=0;//     if-ne v10, v11, :cond_1
a=0;// 
a=0;//     .line 251
a=0;//     invoke-static {v5}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 252
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 254
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 255
a=0;//     invoke-virtual {v3}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     :cond_0
a=0;//     move-object p0, v9
a=0;// 
a=0;//     .line 258
a=0;//     .end local v4    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     .end local p0    # "picPath":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/io/InputStream;);v6=(Conflicted);v7=(Reference,Ljava/io/FileOutputStream;);v8=(Conflicted);v10=(Conflicted);v12=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 234
a=0;//     .restart local v4    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     .restart local p0    # "picPath":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Reference,Lcom/twocloo/base/http/HttpResult;);v5=(Null);v6=(Uninit);v7=(Null);v8=(Uninit);v10=(Integer);v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/base/http/HttpResult;->getHttpEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v10}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 236
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 237
a=0;//     .local v2, "file":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v8, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v8, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 239
a=0;//     .end local v7    # "out":Ljava/io/OutputStream;
a=0;//     .local v8, "out":Ljava/io/OutputStream;
a=0;//     #v8=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v10, 0x200
a=0;// 
a=0;//     :try_start_2
a=0;//     #v10=(PosShort);
a=0;//     new-array v0, v10, [B
a=0;// 
a=0;//     .line 240
a=0;//     .local v0, "buf":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 241
a=0;//     .local v6, "length":I
a=0;//     :goto_1
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     const/4 v10, -0x1
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-ne v6, v10, :cond_3
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual {v8}, Ljava/io/OutputStream;->flush()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 251
a=0;//     invoke-static {v5}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 252
a=0;//     invoke-static {v8}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 254
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 255
a=0;//     invoke-virtual {v3}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 246
a=0;//     .end local v8    # "out":Ljava/io/OutputStream;
a=0;//     .restart local v7    # "out":Ljava/io/OutputStream;
a=0;//     #v7=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 242
a=0;//     .end local v7    # "out":Ljava/io/OutputStream;
a=0;//     .restart local v8    # "out":Ljava/io/OutputStream;
a=0;//     :cond_3
a=0;//     #v7=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v8, v0, v10, v6}, Ljava/io/OutputStream;->write([BII)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 248
a=0;//     .end local v0    # "buf":[B
a=0;//     .end local v6    # "length":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);v10=(Short);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 249
a=0;//     .end local v2    # "file":Ljava/io/File;
a=0;//     .end local v4    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     .end local v8    # "out":Ljava/io/OutputStream;
a=0;//     .local v1, "e":Ljava/lang/Throwable;
a=0;//     .restart local v7    # "out":Ljava/io/OutputStream;
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v2=(Conflicted);v4=(Conflicted);v7=(Reference,Ljava/io/FileOutputStream;);v8=(Conflicted);v10=(Conflicted);v12=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 251
a=0;//     invoke-static {v5}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 252
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 254
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 255
a=0;//     invoke-virtual {v3}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     :cond_4
a=0;//     move-object p0, v9
a=0;// 
a=0;//     .line 258
a=0;//     #p0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 250
a=0;//     .end local v1    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v10=(Conflicted);p0=(Reference,Ljava/lang/String;);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 251
a=0;//     :goto_3
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v5}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 252
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 254
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 255
a=0;//     invoke-virtual {v3}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 256
a=0;//     :cond_5
a=0;//     throw v9
a=0;// 
a=0;//     .line 250
a=0;//     .end local v7    # "out":Ljava/io/OutputStream;
a=0;//     .restart local v2    # "file":Ljava/io/File;
a=0;//     .restart local v4    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     .restart local v8    # "out":Ljava/io/OutputStream;
a=0;//     :catchall_1
a=0;//     #v1=(Uninit);v2=(Reference,Ljava/io/File;);v4=(Reference,Lcom/twocloo/base/http/HttpResult;);v7=(Null);v8=(Reference,Ljava/io/FileOutputStream;);v9=(Null);v10=(Short);v12=(Reference,Ljava/lang/String;);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .end local v8    # "out":Ljava/io/OutputStream;
a=0;//     .restart local v7    # "out":Ljava/io/OutputStream;
a=0;//     #v7=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 248
a=0;//     .end local v2    # "file":Ljava/io/File;
a=0;//     .end local v4    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Conflicted);v4=(Conflicted);v6=(Uninit);v7=(Null);v8=(Conflicted);v9=(Null);v10=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static main([Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "args"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;//     .locals 7
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p3, "encoding"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/twocloo/base/http/HttpResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     .local p1, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .local p2, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "client":Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 60
a=0;//     .local v1, "list":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v5=(Reference,Ljava/util/Iterator;);v6=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v2, p0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 66
a=0;//     .local v2, "post":Lorg/apache/http/client/methods/HttpPost;
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/HttpUtils;->assemblyHeader(Ljava/util/Map;)[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Lorg/apache/http/Header;);
a=0;//     invoke-virtual {v2, v4}, Lorg/apache/http/client/methods/HttpPost;->setHeaders([Lorg/apache/http/Header;)V
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     new-instance v4, Lorg/apache/http/client/entity/UrlEncodedFormEntity;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     invoke-direct {v4, v1, p3}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     invoke-virtual {v2, v4}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 71
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/base/util/HttpUtils;->execute(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     .line 60
a=0;//     .end local v2    # "post":Lorg/apache/http/client/methods/HttpPost;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v4=(Boolean);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 61
a=0;//     .local v3, "temp":Ljava/lang/String;
a=0;//     new-instance v6, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v6, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lorg/apache/http/impl/client/DefaultHttpClient;)Lcom/twocloo/base/http/HttpResult;
a=0;//     .locals 6
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p3, "encoding"    # Ljava/lang/String;
a=0;//     .param p4, "client"    # Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lorg/apache/http/impl/client/DefaultHttpClient;",
a=0;//             ")",
a=0;//             "Lcom/twocloo/base/http/HttpResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     .local p1, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .local p2, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "list":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v1, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v1, p0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 84
a=0;//     .local v1, "post":Lorg/apache/http/client/methods/HttpPost;
a=0;//     #v1=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/HttpUtils;->assemblyHeader(Ljava/util/Map;)[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Lorg/apache/http/Header;);
a=0;//     invoke-virtual {v1, v3}, Lorg/apache/http/client/methods/HttpPost;->setHeaders([Lorg/apache/http/Header;)V
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v3, Lorg/apache/http/client/entity/UrlEncodedFormEntity;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     invoke-direct {v3, v0, p3}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     invoke-virtual {v1, v3}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 89
a=0;//     invoke-static {p4, v1}, Lcom/twocloo/base/util/HttpUtils;->execute(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 78
a=0;//     .end local v1    # "post":Lorg/apache/http/client/methods/HttpPost;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v3=(Boolean);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 79
a=0;//     .local v2, "temp":Ljava/lang/String;
a=0;//     new-instance v5, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v5, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static saveImage(Ljava/lang/String;Landroid/graphics/Bitmap;)Z
a=0;//     .locals 6
a=0;//     .param p0, "picPath"    # Ljava/lang/String;
a=0;//     .param p1, "bm"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 265
a=0;//     .local v2, "out":Ljava/io/FileOutputStream;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 267
a=0;//     .local v1, "file":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 270
a=0;//     :cond_0
a=0;//     new-instance v3, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 271
a=0;//     .end local v2    # "out":Ljava/io/FileOutputStream;
a=0;//     .local v3, "out":Ljava/io/FileOutputStream;
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v5, 0x64
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p1, v4, v5, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 272
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 278
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 274
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 281
a=0;//     .end local v1    # "file":Ljava/io/File;
a=0;//     .end local v3    # "out":Ljava/io/FileOutputStream;
a=0;//     .restart local v2    # "out":Ljava/io/FileOutputStream;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 275
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Null);v4=(Conflicted);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 276
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Reference,Ljava/io/FileOutputStream;);v5=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 278
a=0;//     invoke-static {v2}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 281
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 277
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 278
a=0;//     :goto_2
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v2}, Lcom/twocloo/base/util/HttpUtils;->closeStream(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 279
a=0;//     throw v4
a=0;// 
a=0;//     .line 277
a=0;//     .end local v2    # "out":Ljava/io/FileOutputStream;
a=0;//     .restart local v1    # "file":Ljava/io/File;
a=0;//     .restart local v3    # "out":Ljava/io/FileOutputStream;
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/io/File;);v2=(Null);v3=(Reference,Ljava/io/FileOutputStream;);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "out":Ljava/io/FileOutputStream;
a=0;//     .restart local v2    # "out":Ljava/io/FileOutputStream;
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 275
a=0;//     .end local v2    # "out":Ljava/io/FileOutputStream;
a=0;//     .restart local v3    # "out":Ljava/io/FileOutputStream;
a=0;//     :catch_1
a=0;//     #v2=(Null);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "out":Ljava/io/FileOutputStream;
a=0;//     .restart local v2    # "out":Ljava/io/FileOutputStream;
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_1
a=0;// .end method
}}
