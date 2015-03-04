package com.android.volley.toolbox; class HurlStack { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/HurlStack;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HurlStack.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/toolbox/HttpStack;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/android/volley/toolbox/HurlStack$UrlRewriter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final HEADER_CONTENT_TYPE:Ljava/lang/String; = "Content-Type"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mSslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;
a=0;// 
a=0;// .field private final mUrlRewriter:Lcom/android/volley/toolbox/HurlStack$UrlRewriter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/android/volley/toolbox/HurlStack;-><init>(Lcom/android/volley/toolbox/HurlStack$UrlRewriter;)V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/HurlStack;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/android/volley/toolbox/HurlStack$UrlRewriter;)V
a=0;//     .locals 1
a=0;//     .param p1, "urlRewriter"    # Lcom/android/volley/toolbox/HurlStack$UrlRewriter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/HurlStack;-><init>(Lcom/android/volley/toolbox/HurlStack$UrlRewriter;Ljavax/net/ssl/SSLSocketFactory;)V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/HurlStack;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/android/volley/toolbox/HurlStack$UrlRewriter;Ljavax/net/ssl/SSLSocketFactory;)V
a=0;//     .locals 0
a=0;//     .param p1, "urlRewriter"    # Lcom/android/volley/toolbox/HurlStack$UrlRewriter;
a=0;//     .param p2, "sslSocketFactory"    # Ljavax/net/ssl/SSLSocketFactory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 83
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/HurlStack;);
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/HurlStack;->mUrlRewriter:Lcom/android/volley/toolbox/HurlStack$UrlRewriter;
a=0;// 
a=0;//     .line 84
a=0;//     iput-object p2, p0, Lcom/android/volley/toolbox/HurlStack;->mSslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static addBodyIfExists(Ljava/net/HttpURLConnection;Lcom/android/volley/Request;)V
a=0;//     .locals 4
a=0;//     .param p0, "connection"    # Ljava/net/HttpURLConnection;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/net/HttpURLConnection;",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getBody()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 224
a=0;//     .local v0, "body":[B
a=0;//     #v0=(Reference,[B);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 226
a=0;//     const-string v2, "Content-Type"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getBodyContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2, v3}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 227
a=0;//     new-instance v1, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 228
a=0;//     .local v1, "out":Ljava/io/DataOutputStream;
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {v1}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     .line 231
a=0;//     .end local v1    # "out":Ljava/io/DataOutputStream;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static entityFromConnection(Ljava/net/HttpURLConnection;)Lorg/apache/http/HttpEntity;
a=0;//     .locals 5
a=0;//     .param p0, "connection"    # Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     new-instance v0, Lorg/apache/http/entity/BasicHttpEntity;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/entity/BasicHttpEntity;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/entity/BasicHttpEntity;-><init>()V
a=0;// 
a=0;//     .line 137
a=0;//     .local v0, "entity":Lorg/apache/http/entity/BasicHttpEntity;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lorg/apache/http/entity/BasicHttpEntity;);
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 141
a=0;//     .local v1, "inputStream":Ljava/io/InputStream;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/io/InputStream;);v2=(Conflicted);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/entity/BasicHttpEntity;->setContent(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v3, v4}, Lorg/apache/http/entity/BasicHttpEntity;->setContentLength(J)V
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Lorg/apache/http/entity/BasicHttpEntity;->setContentEncoding(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lorg/apache/http/entity/BasicHttpEntity;->setContentType(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 145
a=0;//     return-object v0
a=0;// 
a=0;//     .line 138
a=0;//     .end local v1    # "inputStream":Ljava/io/InputStream;
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 139
a=0;//     .local v2, "ioe":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .restart local v1    # "inputStream":Ljava/io/InputStream;
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private openConnection(Ljava/net/URL;Lcom/android/volley/Request;)Ljava/net/HttpURLConnection;
a=0;//     .locals 4
a=0;//     .param p1, "url"    # Ljava/net/URL;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/net/URL;",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;)",
a=0;//             "Ljava/net/HttpURLConnection;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     .local p2, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/HurlStack;->createConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 164
a=0;//     .local v0, "connection":Ljava/net/HttpURLConnection;
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {p2}, Lcom/android/volley/Request;->getTimeoutMs()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 165
a=0;//     .local v1, "timeoutMs":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 166
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 167
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
a=0;// 
a=0;//     .line 168
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 171
a=0;//     const-string v2, "https"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/HurlStack;->mSslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;
a=0;// 
a=0;//     #v2=(Reference,Ljavax/net/ssl/SSLSocketFactory;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 172
a=0;//     check-cast v2, Ljavax/net/ssl/HttpsURLConnection;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/android/volley/toolbox/HurlStack;->mSslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
a=0;// 
a=0;//     .line 175
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static setConnectionParametersForRequest(Ljava/net/HttpURLConnection;Lcom/android/volley/Request;)V
a=0;//     .locals 4
a=0;//     .param p0, "connection"    # Ljava/net/HttpURLConnection;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/net/HttpURLConnection;",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getMethod()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 217
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "Unknown method type."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 186
a=0;//     :pswitch_0
a=0;//     #v2=(Integer);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getPostBody()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 187
a=0;//     .local v1, "postBody":[B
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 191
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 192
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 193
a=0;//     const-string v2, "Content-Type"
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getPostBodyContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 193
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2, v3}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 195
a=0;//     new-instance v0, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "out":Ljava/io/DataOutputStream;
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     .line 197
a=0;//     invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     .line 219
a=0;//     .end local v0    # "out":Ljava/io/DataOutputStream;
a=0;//     .end local v1    # "postBody":[B
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 203
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 206
a=0;//     :pswitch_2
a=0;//     #v2=(Integer);
a=0;//     const-string v2, "DELETE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 209
a=0;//     :pswitch_3
a=0;//     #v2=(Integer);
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 210
a=0;//     invoke-static {p0, p1}, Lcom/android/volley/toolbox/HurlStack;->addBodyIfExists(Ljava/net/HttpURLConnection;Lcom/android/volley/Request;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 213
a=0;//     :pswitch_4
a=0;//     #v2=(Integer);
a=0;//     const-string v2, "PUT"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 214
a=0;//     invoke-static {p0, p1}, Lcom/android/volley/toolbox/HurlStack;->addBodyIfExists(Ljava/net/HttpURLConnection;Lcom/android/volley/Request;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected createConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/net/URL;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public performRequest(Lcom/android/volley/Request;Ljava/util/Map;)Lorg/apache/http/HttpResponse;
a=0;//     .locals 18
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Lorg/apache/http/HttpResponse;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     .local p2, "additionalHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 91
a=0;//     .local v13, "url":Ljava/lang/String;
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v6}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 92
a=0;//     .local v6, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/android/volley/Request;->getHeaders()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/Map;);
a=0;//     invoke-virtual {v6, v14}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
a=0;// 
a=0;//     .line 93
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-virtual {v6, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
a=0;// 
a=0;//     .line 94
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/android/volley/toolbox/HurlStack;->mUrlRewriter:Lcom/android/volley/toolbox/HurlStack$UrlRewriter;
a=0;// 
a=0;//     if-eqz v14, :cond_1
a=0;// 
a=0;//     .line 95
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/android/volley/toolbox/HurlStack;->mUrlRewriter:Lcom/android/volley/toolbox/HurlStack$UrlRewriter;
a=0;// 
a=0;//     invoke-interface {v14, v13}, Lcom/android/volley/toolbox/HurlStack$UrlRewriter;->rewriteUrl(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 96
a=0;//     .local v12, "rewritten":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     if-nez v12, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     new-instance v14, Ljava/io/IOException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "URL blocked by rewriter: "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/io/IOException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     #v15=(Uninit);v16=(Uninit);
a=0;//     move-object v13, v12
a=0;// 
a=0;//     .line 101
a=0;//     .end local v12    # "rewritten":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v12=(Conflicted);
a=0;//     new-instance v7, Ljava/net/URL;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v7, v13}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 102
a=0;//     .local v7, "parsedUrl":Ljava/net/URL;
a=0;//     #v7=(Reference,Ljava/net/URL;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/Request;);
a=0;//     invoke-direct {v0, v7, v1}, Lcom/android/volley/toolbox/HurlStack;->openConnection(Ljava/net/URL;Lcom/android/volley/Request;)Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 103
a=0;//     .local v2, "connection":Ljava/net/HttpURLConnection;
a=0;//     #v2=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);v15=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_2
a=0;// 
a=0;//     .line 106
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/android/volley/toolbox/HurlStack;->setConnectionParametersForRequest(Ljava/net/HttpURLConnection;Lcom/android/volley/Request;)V
a=0;// 
a=0;//     .line 108
a=0;//     new-instance v8, Lorg/apache/http/ProtocolVersion;
a=0;// 
a=0;//     #v8=(UninitRef,Lorg/apache/http/ProtocolVersion;);
a=0;//     const-string v14, "HTTP"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     #v16=(One);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {v8, v14, v15, v0}, Lorg/apache/http/ProtocolVersion;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 109
a=0;//     .local v8, "protocolVersion":Lorg/apache/http/ProtocolVersion;
a=0;//     #v8=(Reference,Lorg/apache/http/ProtocolVersion;);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 110
a=0;//     .local v10, "responseCode":I
a=0;//     #v10=(Integer);
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-ne v10, v14, :cond_3
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v14, Ljava/io/IOException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v15, "Could not retrieve response code from HttpUrlConnection."
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/io/IOException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 103
a=0;//     .end local v8    # "protocolVersion":Lorg/apache/http/ProtocolVersion;
a=0;//     .end local v10    # "responseCode":I
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/HurlStack;);v8=(Uninit);v10=(Uninit);v14=(Boolean);v16=(Uninit);
a=0;//     invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Ljava/lang/String;
a=0;// 
a=0;//     .line 104
a=0;//     .local v5, "headerName":Ljava/lang/String;
a=0;//     invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v14, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v5, v14}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 115
a=0;//     .end local v5    # "headerName":Ljava/lang/String;
a=0;//     .restart local v8    # "protocolVersion":Lorg/apache/http/ProtocolVersion;
a=0;//     .restart local v10    # "responseCode":I
a=0;//     :cond_3
a=0;//     #v0=(One);v5=(Conflicted);v8=(Reference,Lorg/apache/http/ProtocolVersion;);v10=(Integer);v14=(Byte);v15=(One);v16=(One);
a=0;//     new-instance v11, Lorg/apache/http/message/BasicStatusLine;
a=0;// 
a=0;//     .line 116
a=0;//     #v11=(UninitRef,Lorg/apache/http/message/BasicStatusLine;);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 115
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v8, v14, v15}, Lorg/apache/http/message/BasicStatusLine;-><init>(Lorg/apache/http/ProtocolVersion;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 117
a=0;//     .local v11, "responseStatus":Lorg/apache/http/StatusLine;
a=0;//     #v11=(Reference,Lorg/apache/http/message/BasicStatusLine;);
a=0;//     new-instance v9, Lorg/apache/http/message/BasicHttpResponse;
a=0;// 
a=0;//     #v9=(UninitRef,Lorg/apache/http/message/BasicHttpResponse;);
a=0;//     invoke-direct {v9, v11}, Lorg/apache/http/message/BasicHttpResponse;-><init>(Lorg/apache/http/StatusLine;)V
a=0;// 
a=0;//     .line 118
a=0;//     .local v9, "response":Lorg/apache/http/message/BasicHttpResponse;
a=0;//     #v9=(Reference,Lorg/apache/http/message/BasicHttpResponse;);
a=0;//     invoke-static {v2}, Lcom/android/volley/toolbox/HurlStack;->entityFromConnection(Ljava/net/HttpURLConnection;)Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-virtual {v9, v14}, Lorg/apache/http/message/BasicHttpResponse;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-interface {v14}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v16=(Reference,Ljava/util/Iterator;);v17=(Conflicted);
a=0;//     invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_5
a=0;// 
a=0;//     .line 125
a=0;//     return-object v9
a=0;// 
a=0;//     .line 119
a=0;//     :cond_5
a=0;//     invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 120
a=0;//     .local v4, "header":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
a=0;//     invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v14, :cond_4
a=0;// 
a=0;//     .line 121
a=0;//     new-instance v3, Lorg/apache/http/message/BasicHeader;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/message/BasicHeader;);
a=0;//     invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     check-cast v14, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Ljava/util/List;
a=0;// 
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v15, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v3, v14, v15}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 122
a=0;//     .local v3, "h":Lorg/apache/http/Header;
a=0;//     #v3=(Reference,Lorg/apache/http/message/BasicHeader;);
a=0;//     invoke-virtual {v9, v3}, Lorg/apache/http/message/BasicHttpResponse;->addHeader(Lorg/apache/http/Header;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
