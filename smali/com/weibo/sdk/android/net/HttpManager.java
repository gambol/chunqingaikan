package com.weibo.sdk.android.net; class HttpManager { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/net/HttpManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpManager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;// .field private static final END_MP_BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;// .field public static final HTTPMETHOD_GET:Ljava/lang/String; = "GET"
a=0;// 
a=0;// .field private static final HTTPMETHOD_POST:Ljava/lang/String; = "POST"
a=0;// 
a=0;// .field private static final MP_BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;// .field private static final MULTIPART_FORM_DATA:Ljava/lang/String; = "multipart/form-data"
a=0;// 
a=0;// .field private static final SET_CONNECTION_TIMEOUT:I = 0x1388
a=0;// 
a=0;// .field private static final SET_SOCKET_TIMEOUT:I = 0x4e20
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-static {}, Lcom/weibo/sdk/android/net/HttpManager;->getBoundry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/weibo/sdk/android/net/HttpManager;->BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "--"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcom/weibo/sdk/android/net/HttpManager;->BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/weibo/sdk/android/net/HttpManager;->MP_BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "--"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcom/weibo/sdk/android/net/HttpManager;->BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "--"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/weibo/sdk/android/net/HttpManager;->END_MP_BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/net/HttpManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static getBoundry()Ljava/lang/String;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v10, 0x1a
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const-wide/16 v8, 0x3
a=0;// 
a=0;//     .line 305
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 306
a=0;//     .local v0, "_sb":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .local v1, "t":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/16 v4, 0xc
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v1, v4, :cond_0
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 307
a=0;//     :cond_0
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     int-to-long v6, v1
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     add-long v2, v4, v6
a=0;// 
a=0;//     .line 308
a=0;//     .local v2, "time":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     rem-long v4, v2, v8
a=0;// 
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 309
a=0;//     long-to-int v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-char v4, v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     rem-int/lit8 v4, v4, 0x9
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 306
a=0;//     :goto_1
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 310
a=0;//     :cond_1
a=0;//     #v4=(Byte);
a=0;//     rem-long v4, v2, v8
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     const-wide/16 v6, 0x1
a=0;// 
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 311
a=0;//     const-wide/16 v4, 0x41
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     rem-long v6, v2, v10
a=0;// 
a=0;//     add-long/2addr v4, v6
a=0;// 
a=0;//     long-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-char v4, v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 313
a=0;//     :cond_2
a=0;//     #v4=(Byte);
a=0;//     const-wide/16 v4, 0x61
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     rem-long v6, v2, v10
a=0;// 
a=0;//     add-long/2addr v4, v6
a=0;// 
a=0;//     long-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-char v4, v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static getNewHttpClient()Lorg/apache/http/client/HttpClient;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 141
a=0;//     .local v6, "trustStore":Ljava/security/KeyStore;
a=0;//     #v6=(Reference,Ljava/security/KeyStore;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v6, v7, v8}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
a=0;// 
a=0;//     .line 143
a=0;//     new-instance v5, Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;);
a=0;//     invoke-direct {v5, v6}, Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;-><init>(Ljava/security/KeyStore;)V
a=0;// 
a=0;//     .line 144
a=0;//     .local v5, "sf":Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;//     #v5=(Reference,Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;);
a=0;//     sget-object v7, Lorg/apache/http/conn/ssl/SSLSocketFactory;->ALLOW_ALL_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/conn/ssl/X509HostnameVerifier;);
a=0;//     invoke-virtual {v5, v7}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
a=0;// 
a=0;//     .line 146
a=0;//     new-instance v3, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v3}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     .line 148
a=0;//     .local v3, "params":Lorg/apache/http/params/HttpParams;
a=0;//     #v3=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     const/16 v7, 0x2710
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     invoke-static {v3, v7}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 149
a=0;//     const/16 v7, 0x2710
a=0;// 
a=0;//     invoke-static {v3, v7}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 151
a=0;//     sget-object v7, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/HttpVersion;);
a=0;//     invoke-static {v3, v7}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V
a=0;// 
a=0;//     .line 152
a=0;//     const-string v7, "UTF-8"
a=0;// 
a=0;//     invoke-static {v3, v7}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v4, Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     invoke-direct {v4}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V
a=0;// 
a=0;//     .line 155
a=0;//     .local v4, "registry":Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;//     #v4=(Reference,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     new-instance v7, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v7=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v8, "http"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lorg/apache/http/conn/scheme/PlainSocketFactory;);
a=0;//     const/16 v10, 0x50
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-direct {v7, v8, v9, v10}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v4, v7}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     .line 156
a=0;//     new-instance v7, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v7=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v8, "https"
a=0;// 
a=0;//     const/16 v9, 0x1bb
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-direct {v7, v8, v5, v9}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v4, v7}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     .line 158
a=0;//     new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     invoke-direct {v0, v3, v4}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
a=0;// 
a=0;//     .line 160
a=0;//     .local v0, "ccm":Lorg/apache/http/conn/ClientConnectionManager;
a=0;//     #v0=(Reference,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     const/16 v7, 0x1388
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     invoke-static {v3, v7}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 161
a=0;//     const/16 v7, 0x4e20
a=0;// 
a=0;//     invoke-static {v3, v7}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 162
a=0;//     new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v1, v0, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 172
a=0;//     .end local v0    # "ccm":Lorg/apache/http/conn/ClientConnectionManager;
a=0;//     .end local v3    # "params":Lorg/apache/http/params/HttpParams;
a=0;//     .end local v4    # "registry":Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;//     .end local v5    # "sf":Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 171
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 172
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static imageContentToUpload(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;//     .locals 10
a=0;//     .param p0, "out"    # Ljava/io/OutputStream;
a=0;//     .param p1, "imgpath"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/weibo/sdk/android/WeiboException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 268
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 235
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 237
a=0;//     .local v7, "temp":Ljava/lang/StringBuilder;
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v8, Lcom/weibo/sdk/android/net/HttpManager;->MP_BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "\r\n"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 238
a=0;//     const-string v8, "Content-Disposition: form-data; name=\"pic\"; filename=\""
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 239
a=0;//     const-string v9, "news_image"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "\"\r\n"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 240
a=0;//     const-string v3, "image/png"
a=0;// 
a=0;//     .line 241
a=0;//     .local v3, "filetype":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "Content-Type: "
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "\r\n\r\n"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 242
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 243
a=0;//     .local v6, "res":[B
a=0;//     #v6=(Reference,[B);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 245
a=0;//     .local v4, "input":Ljava/io/FileInputStream;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0, v6}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 246
a=0;//     new-instance v5, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v5, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 247
a=0;//     .end local v4    # "input":Ljava/io/FileInputStream;
a=0;//     .local v5, "input":Ljava/io/FileInputStream;
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     const v8, 0xc800
a=0;// 
a=0;//     :try_start_1
a=0;//     #v8=(Char);
a=0;//     new-array v0, v8, [B
a=0;// 
a=0;//     .line 249
a=0;//     .local v0, "buffer":[B
a=0;//     :goto_1
a=0;//     #v0=(Reference,[B);v1=(Conflicted);
a=0;//     invoke-virtual {v5, v0}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 250
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-ne v1, v8, :cond_2
a=0;// 
a=0;//     .line 255
a=0;//     const-string v8, "\r\n"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 256
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\r\n"
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v9, Lcom/weibo/sdk/android/net/HttpManager;->END_MP_BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/OutputStream;->write([B)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 260
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     :try_start_2
a=0;//     invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 263
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 264
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v8, Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     invoke-direct {v8, v2}, Lcom/weibo/sdk/android/WeiboException;-><init>(Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     throw v8
a=0;// 
a=0;//     .line 253
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v8=(Byte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0, v0, v8, v1}, Ljava/io/OutputStream;->write([BII)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 257
a=0;//     .end local v0    # "buffer":[B
a=0;//     .end local v1    # "count":I
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 258
a=0;//     .end local v5    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v2    # "e":Ljava/io/IOException;
a=0;//     .restart local v4    # "input":Ljava/io/FileInputStream;
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);v5=(Conflicted);
a=0;//     new-instance v8, Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     invoke-direct {v8, v2}, Lcom/weibo/sdk/android/WeiboException;-><init>(Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     throw v8
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 259
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 260
a=0;//     :goto_3
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 262
a=0;//     :try_start_5
a=0;//     invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     .line 267
a=0;//     :cond_3
a=0;//     throw v8
a=0;// 
a=0;//     .line 263
a=0;//     :catch_2
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 264
a=0;//     .restart local v2    # "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v8, Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     invoke-direct {v8, v2}, Lcom/weibo/sdk/android/WeiboException;-><init>(Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     throw v8
a=0;// 
a=0;//     .line 259
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     .end local v4    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v5    # "input":Ljava/io/FileInputStream;
a=0;//     :catchall_1
a=0;//     #v2=(Uninit);v4=(Null);v5=(Reference,Ljava/io/FileInputStream;);v8=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v4    # "input":Ljava/io/FileInputStream;
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 257
a=0;//     :catch_3
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Null);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static openUrl(Ljava/lang/String;Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 18
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p1, "method"    # Ljava/lang/String;
a=0;//     .param p2, "params"    # Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     .param p3, "file"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/weibo/sdk/android/WeiboException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     const-string v12, ""
a=0;// 
a=0;//     .line 83
a=0;//     .local v12, "result":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/weibo/sdk/android/net/HttpManager;->getNewHttpClient()Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 84
a=0;//     .local v3, "client":Lorg/apache/http/client/HttpClient;
a=0;//     #v3=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 85
a=0;//     .local v10, "request":Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     #v10=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 86
a=0;//     .local v2, "bos":Ljava/io/ByteArrayOutputStream;
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     const-string v16, "http.route.default-proxy"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/weibo/sdk/android/net/NetStateManager;->getAPN()Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     invoke-interface/range {v15 .. v17}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     .line 87
a=0;//     const-string v15, "GET"
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_1
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p0 .. p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "?"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static/range {p2 .. p2}, Lcom/weibo/sdk/android/util/Utility;->encodeUrl(Lcom/weibo/sdk/android/WeiboParameters;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v7, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v7=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v7, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     .local v7, "get":Lorg/apache/http/client/methods/HttpGet;
a=0;//     #v7=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     move-object v10, v7
a=0;// 
a=0;//     .line 123
a=0;//     .end local v7    # "get":Lorg/apache/http/client/methods/HttpGet;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/io/ByteArrayOutputStream;);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Reference,Ujava/lang/Object;);v15=(Conflicted);
a=0;//     invoke-interface {v3, v10}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 124
a=0;//     .local v11, "response":Lorg/apache/http/HttpResponse;
a=0;//     #v11=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v11}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 125
a=0;//     .local v13, "status":Lorg/apache/http/StatusLine;
a=0;//     #v13=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v13}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 127
a=0;//     .local v14, "statusCode":I
a=0;//     #v14=(Integer);
a=0;//     const/16 v15, 0xc8
a=0;// 
a=0;//     #v15=(PosShort);
a=0;//     if-eq v14, v15, :cond_5
a=0;// 
a=0;//     .line 128
a=0;//     invoke-static {v11}, Lcom/weibo/sdk/android/net/HttpManager;->readHttpResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 129
a=0;//     new-instance v15, Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     #v15=(UninitRef,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     invoke-direct {v15, v12, v14}, Lcom/weibo/sdk/android/WeiboException;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v15=(Reference,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     throw v15
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 133
a=0;//     .end local v2    # "bos":Ljava/io/ByteArrayOutputStream;
a=0;//     .end local v3    # "client":Lorg/apache/http/client/HttpClient;
a=0;//     .end local v10    # "request":Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     .end local v11    # "response":Lorg/apache/http/HttpResponse;
a=0;//     .end local v13    # "status":Lorg/apache/http/StatusLine;
a=0;//     .end local v14    # "statusCode":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 134
a=0;//     .local v5, "e":Ljava/io/IOException;
a=0;//     #v5=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v15, Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     #v15=(UninitRef,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     invoke-direct {v15, v5}, Lcom/weibo/sdk/android/WeiboException;-><init>(Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v15=(Reference,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     throw v15
a=0;// 
a=0;//     .line 91
a=0;//     .end local v5    # "e":Ljava/io/IOException;
a=0;//     .restart local v2    # "bos":Ljava/io/ByteArrayOutputStream;
a=0;//     .restart local v3    # "client":Lorg/apache/http/client/HttpClient;
a=0;//     .restart local v10    # "request":Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v2=(Null);v3=(Reference,Lorg/apache/http/client/HttpClient;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Null);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Boolean);v16=(Reference,Ljava/lang/String;);v17=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     const-string v15, "POST"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_4
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v8, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v8=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v8, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 93
a=0;//     .local v8, "post":Lorg/apache/http/client/methods/HttpPost;
a=0;//     #v8=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     move-object v10, v8
a=0;// 
a=0;//     .line 94
a=0;//     #v10=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     .local v4, "data":[B
a=0;//     #v4=(Null);
a=0;//     const-string v15, "content-type"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Lcom/weibo/sdk/android/WeiboParameters;->getValue(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 97
a=0;//     .local v1, "_contentType":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     .end local v2    # "bos":Ljava/io/ByteArrayOutputStream;
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 98
a=0;//     .restart local v2    # "bos":Ljava/io/ByteArrayOutputStream;
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-nez v15, :cond_2
a=0;// 
a=0;//     .line 99
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/weibo/sdk/android/net/HttpManager;->paramToUpload(Ljava/io/OutputStream;Lcom/weibo/sdk/android/WeiboParameters;)V
a=0;// 
a=0;//     .line 100
a=0;//     const-string v15, "Content-Type"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     new-instance v16, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v17, "multipart/form-data; boundary="
a=0;// 
a=0;//     invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v17, Lcom/weibo/sdk/android/net/HttpManager;->BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v8, v15, v0}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static/range {p3 .. p3}, Lcom/weibo/sdk/android/util/Utility$UploadImageUtils;->revitionPostImageSize(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 102
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/weibo/sdk/android/net/HttpManager;->imageContentToUpload(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 116
a=0;//     :goto_1
a=0;//     #v4=(Reference,[B);v9=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 118
a=0;//     new-instance v6, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-direct {v6, v4}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 119
a=0;//     .local v6, "formEntity":Lorg/apache/http/entity/ByteArrayEntity;
a=0;//     #v6=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v8, v6}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 104
a=0;//     .end local v6    # "formEntity":Lorg/apache/http/entity/ByteArrayEntity;
a=0;//     :cond_2
a=0;//     #v4=(Null);v6=(Uninit);v9=(Uninit);v15=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 105
a=0;//     const-string v15, "content-type"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Lcom/weibo/sdk/android/WeiboParameters;->remove(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 106
a=0;//     const-string v15, "Content-Type"
a=0;// 
a=0;//     invoke-virtual {v8, v15, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     :goto_2
a=0;//     invoke-static/range {p2 .. p2}, Lcom/weibo/sdk/android/util/Utility;->encodeParameters(Lcom/weibo/sdk/android/WeiboParameters;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 113
a=0;//     .local v9, "postParam":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v15, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v9, v15}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 114
a=0;//     #v4=(Reference,[B);
a=0;//     invoke-virtual {v2, v4}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 109
a=0;//     .end local v9    # "postParam":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v4=(Null);v9=(Uninit);v15=(Boolean);
a=0;//     const-string v15, "Content-Type"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     const-string v16, "application/x-www-form-urlencoded"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v8, v15, v0}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 120
a=0;//     .end local v1    # "_contentType":Ljava/lang/String;
a=0;//     .end local v4    # "data":[B
a=0;//     .end local v8    # "post":Lorg/apache/http/client/methods/HttpPost;
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v2=(Null);v4=(Uninit);v8=(Uninit);v10=(Null);v15=(Boolean);
a=0;//     const-string v15, "DELETE"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     new-instance v10, Lorg/apache/http/client/methods/HttpDelete;
a=0;// 
a=0;//     .end local v10    # "request":Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     #v10=(UninitRef,Lorg/apache/http/client/methods/HttpDelete;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v10, v0}, Lorg/apache/http/client/methods/HttpDelete;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .restart local v10    # "request":Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     #v10=(Reference,Lorg/apache/http/client/methods/HttpDelete;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     .restart local v11    # "response":Lorg/apache/http/HttpResponse;
a=0;//     .restart local v13    # "status":Lorg/apache/http/StatusLine;
a=0;//     .restart local v14    # "statusCode":I
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/io/ByteArrayOutputStream;);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Reference,Lorg/apache/http/HttpResponse;);v13=(Reference,Lorg/apache/http/StatusLine;);v14=(Integer);v15=(PosShort);
a=0;//     invoke-static {v11}, Lcom/weibo/sdk/android/net/HttpManager;->readHttpResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 132
a=0;//     return-object v12
a=0;// .end method
a=0;// 
a=0;// .method private static paramToUpload(Ljava/io/OutputStream;Lcom/weibo/sdk/android/WeiboParameters;)V
a=0;//     .locals 7
a=0;//     .param p0, "baos"    # Ljava/io/OutputStream;
a=0;//     .param p1, "params"    # Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/weibo/sdk/android/WeiboException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 215
a=0;//     .local v1, "key":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "loc":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/weibo/sdk/android/WeiboParameters;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v2, v5, :cond_0
a=0;// 
a=0;//     .line 229
a=0;//     return-void
a=0;// 
a=0;//     .line 216
a=0;//     :cond_0
a=0;//     invoke-virtual {p1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->getKey(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 217
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 218
a=0;//     .local v4, "temp":Ljava/lang/StringBuilder;
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 219
a=0;//     sget-object v5, Lcom/weibo/sdk/android/net/HttpManager;->MP_BOUNDARY:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "\r\n"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 220
a=0;//     const-string v5, "content-disposition: form-data; name=\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "\"\r\n\r\n"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {p1, v1}, Lcom/weibo/sdk/android/WeiboParameters;->getValue(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 222
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 224
a=0;//     .local v3, "res":[B
a=0;//     :try_start_0
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {p0, v3}, Ljava/io/OutputStream;->write([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 215
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 225
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 226
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v5, Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     invoke-direct {v5, v0}, Lcom/weibo/sdk/android/WeiboException;-><init>(Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method private static readHttpResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
a=0;//     .locals 12
a=0;//     .param p0, "response"    # Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     .line 277
a=0;//     #v11=(Byte);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     .line 278
a=0;//     .local v6, "result":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 281
a=0;//     .local v1, "entity":Lorg/apache/http/HttpEntity;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 282
a=0;//     .local v3, "inputStream":Ljava/io/InputStream;
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 284
a=0;//     .local v0, "content":Ljava/io/ByteArrayOutputStream;
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v9, "Content-Encoding"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0, v9}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 285
a=0;//     .local v2, "header":Lorg/apache/http/Header;
a=0;//     #v2=(Reference,Lorg/apache/http/Header;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "gzip"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-le v9, v11, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     new-instance v4, Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/zip/GZIPInputStream;);
a=0;//     invoke-direct {v4, v3}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .end local v3    # "inputStream":Ljava/io/InputStream;
a=0;//     .local v4, "inputStream":Ljava/io/InputStream;
a=0;//     #v4=(Reference,Ljava/util/zip/GZIPInputStream;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 289
a=0;//     .end local v4    # "inputStream":Ljava/io/InputStream;
a=0;//     .restart local v3    # "inputStream":Ljava/io/InputStream;
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 290
a=0;//     .local v5, "readBytes":I
a=0;//     #v5=(Null);
a=0;//     const/16 v9, 0x200
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     new-array v8, v9, [B
a=0;// 
a=0;//     .line 291
a=0;//     .local v8, "sBuffer":[B
a=0;//     :goto_0
a=0;//     #v5=(Integer);v8=(Reference,[B);
a=0;//     invoke-virtual {v3, v8}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-ne v5, v11, :cond_1
a=0;// 
a=0;//     .line 294
a=0;//     new-instance v7, Ljava/lang/String;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,[B);
a=0;//     invoke-direct {v7, v9}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .end local v6    # "result":Ljava/lang/String;
a=0;//     .local v7, "result":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, v7
a=0;// 
a=0;//     .line 299
a=0;//     .end local v0    # "content":Ljava/io/ByteArrayOutputStream;
a=0;//     .end local v2    # "header":Lorg/apache/http/Header;
a=0;//     .end local v3    # "inputStream":Ljava/io/InputStream;
a=0;//     .end local v5    # "readBytes":I
a=0;//     .end local v7    # "result":Ljava/lang/String;
a=0;//     .end local v8    # "sBuffer":[B
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v8=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 292
a=0;//     .restart local v0    # "content":Ljava/io/ByteArrayOutputStream;
a=0;//     .restart local v2    # "header":Lorg/apache/http/Header;
a=0;//     .restart local v3    # "inputStream":Ljava/io/InputStream;
a=0;//     .restart local v5    # "readBytes":I
a=0;//     .restart local v6    # "result":Ljava/lang/String;
a=0;//     .restart local v8    # "sBuffer":[B
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Reference,Lorg/apache/http/Header;);v3=(Reference,Ujava/lang/Object;);v5=(Integer);v7=(Uninit);v8=(Reference,[B);v9=(PosShort);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v0, v8, v9, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 296
a=0;//     .end local v0    # "content":Ljava/io/ByteArrayOutputStream;
a=0;//     .end local v2    # "header":Lorg/apache/http/Header;
a=0;//     .end local v3    # "inputStream":Ljava/io/InputStream;
a=0;//     .end local v5    # "readBytes":I
a=0;//     .end local v8    # "sBuffer":[B
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     :goto_2
a=0;//     #v9=(Reference,Ujava/lang/Object;);
a=0;//     move-object v7, v6
a=0;// 
a=0;//     .line 299
a=0;//     .local v7, "result":Ljava/lang/Object;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 297
a=0;//     .end local v7    # "result":Ljava/lang/Object;
a=0;//     :catch_1
a=0;//     #v7=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_2
a=0;// .end method
}}
