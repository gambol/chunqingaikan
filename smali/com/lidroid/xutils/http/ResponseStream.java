package com.lidroid.xutils.http; class ResponseStream { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/ResponseStream;
a=0;// .super Ljava/io/InputStream;
a=0;// .source "ResponseStream.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private _directResult:Ljava/lang/String;
a=0;// 
a=0;// .field private baseResponse:Lorg/apache/http/HttpResponse;
a=0;// 
a=0;// .field private baseStream:Ljava/io/InputStream;
a=0;// 
a=0;// .field private charset:Ljava/lang/String;
a=0;// 
a=0;// .field private expiry:J
a=0;// 
a=0;// .field private requestMethod:Ljava/lang/String;
a=0;// 
a=0;// .field private requestUrl:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "result"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-direct {p0}, Ljava/io/InputStream;-><init>()V
a=0;// 
a=0;//     .line 61
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "result may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/ResponseStream;->_directResult:Ljava/lang/String;
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lorg/apache/http/HttpResponse;Ljava/lang/String;J)V
a=0;//     .locals 6
a=0;//     .param p1, "baseResponse"    # Lorg/apache/http/HttpResponse;
a=0;//     .param p2, "requestUrl"    # Ljava/lang/String;
a=0;//     .param p3, "expiry"    # J
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-wide v4, p3
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/lidroid/xutils/http/ResponseStream;-><init>(Lorg/apache/http/HttpResponse;Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/ResponseStream;);p0=(Reference,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lorg/apache/http/HttpResponse;Ljava/lang/String;Ljava/lang/String;J)V
a=0;//     .locals 2
a=0;//     .param p1, "baseResponse"    # Lorg/apache/http/HttpResponse;
a=0;//     .param p2, "charset"    # Ljava/lang/String;
a=0;//     .param p3, "requestUrl"    # Ljava/lang/String;
a=0;//     .param p4, "expiry"    # J
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-direct {p0}, Ljava/io/InputStream;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "baseResponse may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 51
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseResponse:Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     .line 52
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 53
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/ResponseStream;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     iput-object p3, p0, Lcom/lidroid/xutils/http/ResponseStream;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 55
a=0;//     iput-wide p4, p0, Lcom/lidroid/xutils/http/ResponseStream;->expiry:J
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public available()I
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 151
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->available()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getBaseResponse()Lorg/apache/http/HttpResponse;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseResponse:Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getBaseStream()Ljava/io/InputStream;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLocale()Ljava/util/Locale;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->_directResult:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 95
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseResponse:Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getLocale()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getReasonPhrase()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->_directResult:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 100
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseResponse:Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getRequestMethod()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->requestMethod:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRequestUrl()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getStatusCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->_directResult:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0xc8
a=0;// 
a=0;//     .line 90
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseResponse:Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public mark(I)V
a=0;//     .locals 1
a=0;//     .param p1, "readLimit"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public markSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 169
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public read()I
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 145
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public read([B)I
a=0;//     .locals 1
a=0;//     .param p1, "buffer"    # [B
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 175
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public read([BII)I
a=0;//     .locals 1
a=0;//     .param p1, "buffer"    # [B
a=0;//     .param p2, "offset"    # I
a=0;//     .param p3, "length"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 181
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public readFile(Ljava/lang/String;)V
a=0;//     .locals 7
a=0;//     .param p1, "savePath"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/ResponseStream;->_directResult:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 125
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 128
a=0;//     .local v3, "out":Ljava/io/BufferedOutputStream;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     new-instance v5, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v5, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v4, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 129
a=0;//     .end local v3    # "out":Ljava/io/BufferedOutputStream;
a=0;//     .local v4, "out":Ljava/io/BufferedOutputStream;
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     new-instance v1, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-direct {v1, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 130
a=0;//     .local v1, "ins":Ljava/io/BufferedInputStream;
a=0;//     #v1=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     const/16 v5, 0x1000
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     new-array v0, v5, [B
a=0;// 
a=0;//     .line 131
a=0;//     .local v0, "buffer":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 132
a=0;//     .local v2, "len":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/BufferedInputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ne v2, v5, :cond_2
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->flush()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 137
a=0;//     invoke-static {v4}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v5}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_2
a=0;//     #v5=(Byte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v0, v5, v2}, Ljava/io/BufferedOutputStream;->write([BII)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 136
a=0;//     .end local v0    # "buffer":[B
a=0;//     .end local v1    # "ins":Ljava/io/BufferedInputStream;
a=0;//     .end local v2    # "len":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 137
a=0;//     .end local v4    # "out":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "out":Ljava/io/BufferedOutputStream;
a=0;//     :goto_2
a=0;//     #v3=(Reference,Ljava/io/BufferedOutputStream;);v4=(Conflicted);
a=0;//     invoke-static {v3}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v6}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 139
a=0;//     throw v5
a=0;// 
a=0;//     .line 136
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v5=(Conflicted);v6=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public readString()Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/ResponseStream;->_directResult:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/ResponseStream;->_directResult:Ljava/lang/String;
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v1, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v3, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/ResponseStream;->charset:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 108
a=0;//     .local v1, "reader":Ljava/io/BufferedReader;
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 109
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 110
a=0;//     .local v0, "line":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 113
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/lidroid/xutils/http/ResponseStream;->_directResult:Ljava/lang/String;
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/ResponseStream;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     sget-object v3, Lcom/lidroid/xutils/HttpUtils;->sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/ResponseStream;->requestMethod:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/lidroid/xutils/http/HttpCache;->isEnabled(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 115
a=0;//     sget-object v3, Lcom/lidroid/xutils/HttpUtils;->sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/http/HttpCache;);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/ResponseStream;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/ResponseStream;->_directResult:Ljava/lang/String;
a=0;// 
a=0;//     iget-wide v6, p0, Lcom/lidroid/xutils/http/ResponseStream;->expiry:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v3, v4, v5, v6, v7}, Lcom/lidroid/xutils/http/HttpCache;->put(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/ResponseStream;->_directResult:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 119
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 118
a=0;//     .end local v0    # "line":Ljava/lang/String;
a=0;//     .end local v1    # "reader":Ljava/io/BufferedReader;
a=0;//     .end local v2    # "sb":Ljava/lang/StringBuilder;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 119
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v4}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 120
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized reset()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 188
a=0;//     :goto_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method setRequestMethod(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "requestMethod"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/ResponseStream;->requestMethod:Ljava/lang/String;
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public skip(J)J
a=0;//     .locals 2
a=0;//     .param p1, "byteCount"    # J
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/InputStream;);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/ResponseStream;->baseStream:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
}}
