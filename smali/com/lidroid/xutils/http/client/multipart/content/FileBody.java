package com.lidroid.xutils.http.client.multipart.content; class FileBody { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/multipart/content/FileBody;
a=0;// .super Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;
a=0;// .source "FileBody.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final charset:Ljava/lang/String;
a=0;// 
a=0;// .field private final file:Ljava/io/File;
a=0;// 
a=0;// .field private final filename:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/File;)V
a=0;//     .locals 2
a=0;//     .param p1, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     #v1=(Null);
a=0;//     const-string v0, "application/octet-stream"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v1, v0, v1}, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 67
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "file"    # Ljava/io/File;
a=0;//     .param p2, "mimeType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 62
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0, p2, v0}, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 63
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "file"    # Ljava/io/File;
a=0;//     .param p2, "mimeType"    # Ljava/lang/String;
a=0;//     .param p3, "charset"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0, p2, p3}, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "file"    # Ljava/io/File;
a=0;//     .param p2, "filename"    # Ljava/lang/String;
a=0;//     .param p3, "mimeType"    # Ljava/lang/String;
a=0;//     .param p4, "charset"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0, p3}, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "File may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->file:Ljava/io/File;
a=0;// 
a=0;//     .line 44
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 45
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->filename:Ljava/lang/String;
a=0;// 
a=0;//     .line 49
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iput-object p4, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->filename:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCharset()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->charset:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentLength()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->file:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getFile()Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->file:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFilename()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->filename:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getInputStream()Ljava/io/InputStream;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->file:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTransferEncoding()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     const-string v0, "binary"
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
a=0;//     .line 74
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v4, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v5, "Output stream may not be null"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "in":Ljava/io/BufferedInputStream;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     new-instance v4, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->file:Ljava/io/File;
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 80
a=0;//     .end local v0    # "in":Ljava/io/BufferedInputStream;
a=0;//     .local v1, "in":Ljava/io/BufferedInputStream;
a=0;//     #v1=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     const/16 v4, 0x1000
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(PosShort);
a=0;//     new-array v3, v4, [B
a=0;// 
a=0;//     .line 82
a=0;//     .local v3, "tmp":[B
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Reference,[B);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v1, v3}, Ljava/io/BufferedInputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .local v2, "l":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v2, v4, :cond_2
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// 
a=0;//     .line 83
a=0;//     :cond_2
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1, v3, v4, v2}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     iget-wide v5, v4, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     int-to-long v7, v2
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     add-long/2addr v5, v7
a=0;// 
a=0;//     iput-wide v5, v4, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->doCallBack(Z)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v4, Ljava/io/InterruptedIOException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/InterruptedIOException;);
a=0;//     const-string v5, "stop"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InterruptedIOException;);
a=0;//     throw v4
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 90
a=0;//     .end local v2    # "l":I
a=0;//     .end local v3    # "tmp":[B
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 91
a=0;//     .end local v1    # "in":Ljava/io/BufferedInputStream;
a=0;//     .restart local v0    # "in":Ljava/io/BufferedInputStream;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/BufferedInputStream;);v1=(Conflicted);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 92
a=0;//     throw v4
a=0;// 
a=0;//     .line 90
a=0;//     :catchall_1
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);v4=(Conflicted);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
