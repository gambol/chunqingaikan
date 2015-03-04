package com.lidroid.xutils.http.client.multipart.content; class StringBody { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/multipart/content/StringBody;
a=0;// .super Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;
a=0;// .source "StringBody.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;// .field private final content:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "text"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/UnsupportedEncodingException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     const-string v0, "text/plain"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V
a=0;// 
a=0;//     .line 112
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/StringBody;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V
a=0;//     .locals 2
a=0;//     .param p1, "text"    # Ljava/lang/String;
a=0;//     .param p2, "mimeType"    # Ljava/lang/String;
a=0;//     .param p3, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/UnsupportedEncodingException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-direct {p0, p2}, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/StringBody;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Text may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     .line 80
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object p3
a=0;// 
a=0;//     .line 82
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p3}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->content:[B
a=0;// 
a=0;//     .line 83
a=0;//     iput-object p3, p0, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 84
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V
a=0;//     .locals 1
a=0;//     .param p1, "text"    # Ljava/lang/String;
a=0;//     .param p2, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/UnsupportedEncodingException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     const-string v0, "text/plain"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0, p2}, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V
a=0;// 
a=0;//     .line 98
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/StringBody;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static create(Ljava/lang/String;)Lcom/lidroid/xutils/http/client/multipart/content/StringBody;
a=0;//     .locals 1
a=0;//     .param p0, "text"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/IllegalArgumentException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0, v0}, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->create(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/lidroid/xutils/http/client/multipart/content/StringBody;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/StringBody;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static create(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/lidroid/xutils/http/client/multipart/content/StringBody;
a=0;//     .locals 4
a=0;//     .param p0, "text"    # Ljava/lang/String;
a=0;//     .param p1, "mimeType"    # Ljava/lang/String;
a=0;//     .param p2, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/IllegalArgumentException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     :try_start_0
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/content/StringBody;);
a=0;//     invoke-direct {v1, p0, p1, p2}, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/StringBody;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 41
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 42
a=0;//     .local v0, "ex":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Charset "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " is not supported"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static create(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/lidroid/xutils/http/client/multipart/content/StringBody;
a=0;//     .locals 1
a=0;//     .param p0, "text"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/IllegalArgumentException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0, p1}, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->create(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/lidroid/xutils/http/client/multipart/content/StringBody;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/StringBody;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCharset()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/charset/Charset;);
a=0;//     invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentLength()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->content:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getFilename()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getReader()Ljava/io/Reader;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     new-instance v0, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     .line 116
a=0;//     #v0=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     new-instance v1, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->content:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 117
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 115
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStreamReader;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTransferEncoding()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     const-string v0, "8bit"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 9
a=0;//     .param p1, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     #v8=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v4, "Output stream may not be null"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 124
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->content:[B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-direct {v0, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 125
a=0;//     .local v0, "in":Ljava/io/InputStream;
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     const/16 v3, 0x1000
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     new-array v2, v3, [B
a=0;// 
a=0;//     .line 127
a=0;//     .local v2, "tmp":[B
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Reference,[B);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .local v1, "l":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v1, v3, :cond_2
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// 
a=0;//     .line 128
a=0;//     :cond_2
a=0;//     invoke-virtual {p1, v2, v8, v1}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     iget-wide v4, v3, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     int-to-long v6, v1
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     add-long/2addr v4, v6
a=0;// 
a=0;//     iput-wide v4, v3, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     invoke-virtual {v3, v8}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->doCallBack(Z)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 131
a=0;//     new-instance v3, Ljava/io/InterruptedIOException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/InterruptedIOException;);
a=0;//     const-string v4, "stop"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InterruptedIOException;);
a=0;//     throw v3
a=0;// .end method
}}
