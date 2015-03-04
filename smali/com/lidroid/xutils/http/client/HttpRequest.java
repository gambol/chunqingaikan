package com.lidroid.xutils.http.client; class HttpRequest { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;// .super Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// .source "HttpRequest.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/HttpEntityEnclosingRequest;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private entity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;// .field private method:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;// .field private uriBuilder:Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;// .field private uriCharset:Ljava/nio/charset/Charset;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;)V
a=0;//     .locals 0
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-direct {p0}, Lorg/apache/http/client/methods/HttpRequestBase;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest;);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->method:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     .param p2, "uri"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-direct {p0}, Lorg/apache/http/client/methods/HttpRequestBase;-><init>()V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest;);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->method:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p0, p2}, Lcom/lidroid/xutils/http/client/HttpRequest;->setURI(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/net/URI;)V
a=0;//     .locals 0
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     .param p2, "uri"    # Ljava/net/URI;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     invoke-direct {p0}, Lorg/apache/http/client/methods/HttpRequestBase;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest;);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->method:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {p0, p2}, Lcom/lidroid/xutils/http/client/HttpRequest;->setURI(Ljava/net/URI;)V
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addQueryStringParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;//     .locals 1
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriBuilder:Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/util/URIBuilder;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/lidroid/xutils/http/client/util/URIBuilder;->addParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     .line 71
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addQueryStringParameter(Lorg/apache/http/NameValuePair;)Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;//     .locals 3
a=0;//     .param p1, "nameValuePair"    # Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriBuilder:Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/util/URIBuilder;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/lidroid/xutils/http/client/util/URIBuilder;->addParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     .line 76
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addQueryStringParams(Ljava/util/List;)Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/client/HttpRequest;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     .local p1, "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 85
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 81
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Boolean);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     .line 82
a=0;//     .local v0, "nameValuePair":Lorg/apache/http/NameValuePair;
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriBuilder:Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/client/util/URIBuilder;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/lidroid/xutils/http/client/util/URIBuilder;->addParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clone()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/CloneNotSupportedException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     invoke-super {p0}, Lorg/apache/http/client/methods/HttpRequestBase;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;// 
a=0;//     .line 183
a=0;//     .local v0, "clone":Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->entity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->entity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     invoke-static {v1}, Lorg/apache/http/client/utils/CloneUtils;->clone(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/lidroid/xutils/http/client/HttpRequest;->entity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .line 186
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public expectContinue()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     const-string v1, "Expect"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lcom/lidroid/xutils/http/client/HttpRequest;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 177
a=0;//     .local v0, "expect":Lorg/apache/http/Header;
a=0;//     #v0=(Reference,Lorg/apache/http/Header;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "100-continue"
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getEntity()Lorg/apache/http/HttpEntity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->entity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMethod()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->method:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getURI()Ljava/net/URI;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriCharset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/charset/Charset;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     invoke-static {p0}, Lcom/lidroid/xutils/util/OtherUtils;->getCharsetFromHttpRequest(Lorg/apache/http/client/methods/HttpRequestBase;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriCharset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriCharset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriCharset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 143
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriBuilder:Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriCharset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/charset/Charset;);
a=0;//     invoke-virtual {v1, v2}, Lcom/lidroid/xutils/http/client/util/URIBuilder;->build(Ljava/nio/charset/Charset;)Ljava/net/URI;
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 146
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 144
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 145
a=0;//     .local v0, "e":Ljava/net/URISyntaxException;
a=0;//     #v0=(Reference,Ljava/net/URISyntaxException;);
a=0;//     invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/lidroid/xutils/util/LogUtils;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setEntity(Lorg/apache/http/HttpEntity;)V
a=0;//     .locals 0
a=0;//     .param p1, "entity"    # Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->entity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .line 172
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRequestParams(Lcom/lidroid/xutils/http/RequestParams;)V
a=0;//     .locals 4
a=0;//     .param p1, "param"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriCharset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/charset/Charset;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/RequestParams;->getCharset()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriCharset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/RequestParams;->getHeaders()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 94
a=0;//     .local v1, "headerItems":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/RequestParams$HeaderItem;>;"
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 95
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/RequestParams;->getQueryStringParams()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/lidroid/xutils/http/client/HttpRequest;->addQueryStringParams(Ljava/util/List;)Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/RequestParams;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/lidroid/xutils/http/client/HttpRequest;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 106
a=0;//     .end local v1    # "headerItems":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/RequestParams$HeaderItem;>;"
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 95
a=0;//     .restart local v1    # "headerItems":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/RequestParams$HeaderItem;>;"
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/util/List;);v2=(Reference,Ljava/util/Iterator;);v3=(Boolean);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;// 
a=0;//     .line 96
a=0;//     .local v0, "headerItem":Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;//     iget-boolean v3, v0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->overwrite:Z
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v3, v0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->header:Lorg/apache/http/Header;
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/Header;);
a=0;//     invoke-virtual {p0, v3}, Lcom/lidroid/xutils/http/client/HttpRequest;->setHeader(Lorg/apache/http/Header;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 99
a=0;//     :cond_4
a=0;//     #v3=(Boolean);
a=0;//     iget-object v3, v0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->header:Lorg/apache/http/Header;
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/Header;);
a=0;//     invoke-virtual {p0, v3}, Lcom/lidroid/xutils/http/client/HttpRequest;->addHeader(Lorg/apache/http/Header;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setRequestParams(Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;)V
a=0;//     .locals 5
a=0;//     .param p1, "param"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .param p2, "callBackHandler"    # Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriCharset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v3=(Reference,Ljava/nio/charset/Charset;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/RequestParams;->getCharset()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriCharset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/RequestParams;->getHeaders()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 114
a=0;//     .local v2, "headerItems":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/RequestParams$HeaderItem;>;"
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 115
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 123
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/RequestParams;->getQueryStringParams()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/lidroid/xutils/http/client/HttpRequest;->addQueryStringParams(Ljava/util/List;)Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;// 
a=0;//     .line 124
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/RequestParams;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 125
a=0;//     .local v0, "entity":Lorg/apache/http/HttpEntity;
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 126
a=0;//     instance-of v3, v0, Lcom/lidroid/xutils/http/client/entity/UploadEntity;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 127
a=0;//     #v3=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     check-cast v3, Lcom/lidroid/xutils/http/client/entity/UploadEntity;
a=0;// 
a=0;//     invoke-interface {v3, p2}, Lcom/lidroid/xutils/http/client/entity/UploadEntity;->setCallBackHandler(Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;)V
a=0;// 
a=0;//     .line 129
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p0, v0}, Lcom/lidroid/xutils/http/client/HttpRequest;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 132
a=0;//     .end local v0    # "entity":Lorg/apache/http/HttpEntity;
a=0;//     .end local v2    # "headerItems":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/RequestParams$HeaderItem;>;"
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 115
a=0;//     .restart local v2    # "headerItems":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/RequestParams$HeaderItem;>;"
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v2=(Reference,Ljava/util/List;);v3=(Reference,Ljava/util/Iterator;);v4=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;// 
a=0;//     .line 116
a=0;//     .local v1, "headerItem":Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;//     iget-boolean v4, v1, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->overwrite:Z
a=0;// 
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v4, v1, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->header:Lorg/apache/http/Header;
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/Header;);
a=0;//     invoke-virtual {p0, v4}, Lcom/lidroid/xutils/http/client/HttpRequest;->setHeader(Lorg/apache/http/Header;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     :cond_5
a=0;//     #v4=(Boolean);
a=0;//     iget-object v4, v1, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->header:Lorg/apache/http/Header;
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/Header;);
a=0;//     invoke-virtual {p0, v4}, Lcom/lidroid/xutils/http/client/HttpRequest;->addHeader(Lorg/apache/http/Header;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setURI(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "uri"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/util/URIBuilder;);
a=0;//     invoke-direct {v0, p1}, Lcom/lidroid/xutils/http/client/util/URIBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/util/URIBuilder;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriBuilder:Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     .line 157
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setURI(Ljava/net/URI;)V
a=0;//     .locals 1
a=0;//     .param p1, "uri"    # Ljava/net/URI;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/util/URIBuilder;);
a=0;//     invoke-direct {v0, p1}, Lcom/lidroid/xutils/http/client/util/URIBuilder;-><init>(Ljava/net/URI;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/util/URIBuilder;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/HttpRequest;->uriBuilder:Lcom/lidroid/xutils/http/client/util/URIBuilder;
a=0;// 
a=0;//     .line 153
a=0;//     return-void
a=0;// .end method
}}
