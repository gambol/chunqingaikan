package com.lidroid.xutils.http.client.multipart.content; class InputStreamBody { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;
a=0;// .super Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;
a=0;// .source "InputStreamBody.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final filename:Ljava/lang/String;
a=0;// 
a=0;// .field private final in:Ljava/io/InputStream;
a=0;// 
a=0;// .field private length:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/InputStream;J)V
a=0;//     .locals 6
a=0;//     .param p1, "in"    # Ljava/io/InputStream;
a=0;//     .param p2, "length"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     const-string v4, "no_name"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "application/octet-stream"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     move-wide v2, p2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;-><init>(Ljava/io/InputStream;JLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/InputStream;JLjava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "in"    # Ljava/io/InputStream;
a=0;//     .param p2, "length"    # J
a=0;//     .param p4, "filename"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     const-string v5, "application/octet-stream"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     move-wide v2, p2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;-><init>(Ljava/io/InputStream;JLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 47
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/InputStream;JLjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "in"    # Ljava/io/InputStream;
a=0;//     .param p2, "length"    # J
a=0;//     .param p4, "filename"    # Ljava/lang/String;
a=0;//     .param p5, "mimeType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0, p5}, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Input stream may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->in:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 41
a=0;//     iput-object p4, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->filename:Ljava/lang/String;
a=0;// 
a=0;//     .line 42
a=0;//     iput-wide p2, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->length:J
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCharset()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentLength()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->length:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getFilename()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->filename:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getInputStream()Ljava/io/InputStream;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->in:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTransferEncoding()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     const-string v0, "binary"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 7
a=0;//     .param p1, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "Output stream may not be null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     const/16 v2, 0x1000
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(PosShort);
a=0;//     new-array v1, v2, [B
a=0;// 
a=0;//     .line 64
a=0;//     .local v1, "tmp":[B
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Reference,[B);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->in:Ljava/io/InputStream;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v2, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .local v0, "l":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->in:Ljava/io/InputStream;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// 
a=0;//     .line 65
a=0;//     :cond_2
a=0;//     #v2=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v1, v2, v0}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     iget-wide v3, v2, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     int-to-long v5, v0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     add-long/2addr v3, v5
a=0;// 
a=0;//     iput-wide v3, v2, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->doCallBack(Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v2, Ljava/io/InterruptedIOException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/InterruptedIOException;);
a=0;//     const-string v3, "stop"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InterruptedIOException;);
a=0;//     throw v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 72
a=0;//     .end local v0    # "l":I
a=0;//     .end local v1    # "tmp":[B
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 73
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;->in:Ljava/io/InputStream;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v3}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 74
a=0;//     throw v2
a=0;// .end method
}}
