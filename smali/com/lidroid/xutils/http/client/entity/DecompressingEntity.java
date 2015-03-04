package com.lidroid.xutils.http.client.entity; class DecompressingEntity { void a() { int a;
a=0;// .class abstract Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;
a=0;// .super Lorg/apache/http/entity/HttpEntityWrapper;
a=0;// .source "DecompressingEntity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/lidroid/xutils/http/client/entity/UploadEntity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;// .field private content:Ljava/io/InputStream;
a=0;// 
a=0;// .field private uncompressedLength:J
a=0;// 
a=0;// .field private uploadedSize:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lorg/apache/http/HttpEntity;)V
a=0;//     .locals 2
a=0;//     .param p1, "wrapped"    # Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0, p1}, Lorg/apache/http/entity/HttpEntityWrapper;-><init>(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 87
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->uploadedSize:J
a=0;// 
a=0;//     .line 121
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .line 48
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->uncompressedLength:J
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getDecompressingStream()Ljava/io/InputStream;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     .local v1, "in":Ljava/io/InputStream;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->wrappedEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 57
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {p0, v1}, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->decorate(Ljava/io/InputStream;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 58
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "ex":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 60
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method abstract decorate(Ljava/io/InputStream;)Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public getContent()Ljava/io/InputStream;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->wrappedEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isStreaming()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->content:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->getDecompressingStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->content:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->content:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 75
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->getDecompressingStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getContentLength()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public setCallBackHandler(Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;)V
a=0;//     .locals 0
a=0;//     .param p1, "callBackHandler"    # Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .line 126
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 9
a=0;//     .param p1, "outStream"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Output stream may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 99
a=0;//     .local v6, "inStream":Ljava/io/InputStream;
a=0;//     :try_start_0
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 101
a=0;//     #v6=(Reference,Ljava/io/InputStream;);
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v8, v0, [B
a=0;// 
a=0;//     .line 103
a=0;//     .local v8, "tmp":[B
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Reference,[B);
a=0;//     invoke-virtual {v6, v8}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .local v7, "len":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v7, v0, :cond_3
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->uncompressedLength:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->uploadedSize:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 117
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {v6}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 119
a=0;//     return-void
a=0;// 
a=0;//     .line 104
a=0;//     :cond_3
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v8, v0, v7}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 105
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->uploadedSize:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     int-to-long v2, v7
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->uploadedSize:J
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->uncompressedLength:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->uploadedSize:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     new-instance v0, Ljava/io/InterruptedIOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/InterruptedIOException;);
a=0;//     const-string v1, "stop"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InterruptedIOException;);
a=0;//     throw v0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 116
a=0;//     .end local v7    # "len":I
a=0;//     .end local v8    # "tmp":[B
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 117
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v6}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 118
a=0;//     throw v0
a=0;// .end method
}}
