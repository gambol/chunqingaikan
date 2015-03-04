package com.lidroid.xutils.http.client.entity; class InputStreamUploadEntity { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;
a=0;// .super Lorg/apache/http/entity/AbstractHttpEntity;
a=0;// .source "InputStreamUploadEntity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/lidroid/xutils/http/client/entity/UploadEntity;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BUFFER_SIZE:I = 0x800
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;// .field private final content:Ljava/io/InputStream;
a=0;// 
a=0;// .field private final length:J
a=0;// 
a=0;// .field private uploadedSize:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/InputStream;J)V
a=0;//     .locals 2
a=0;//     .param p1, "inputStream"    # Ljava/io/InputStream;
a=0;//     .param p2, "length"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Lorg/apache/http/entity/AbstractHttpEntity;-><init>()V
a=0;// 
a=0;//     .line 61
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     .line 123
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .line 42
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Source input stream may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(LongHi);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->content:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 46
a=0;//     iput-wide p2, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->length:J
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public consumeContent()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->content:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 121
a=0;//     return-void
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
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->content:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentLength()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->length:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public isRepeatable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isStreaming()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setCallBackHandler(Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;)V
a=0;//     .locals 0
a=0;//     .param p1, "callBackHandler"    # Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .line 128
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 14
a=0;//     .param p1, "outStream"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v12, 0x0
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     .line 64
a=0;//     #v11=(Byte);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 65
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
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->content:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 69
a=0;//     .local v7, "inStream":Ljava/io/InputStream;
a=0;//     #v7=(Reference,Ljava/io/InputStream;);
a=0;//     const/16 v0, 0x800
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(PosShort);
a=0;//     new-array v6, v0, [B
a=0;// 
a=0;//     .line 71
a=0;//     .local v6, "buffer":[B
a=0;//     #v6=(Reference,[B);
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->length:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v12
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_5
a=0;// 
a=0;//     .line 73
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v7, v6}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .local v8, "l":I
a=0;//     #v8=(Integer);
a=0;//     if-ne v8, v11, :cond_4
a=0;// 
a=0;//     .line 100
a=0;//     .end local v8    # "l":I
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->length:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 105
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {v7}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 107
a=0;//     return-void
a=0;// 
a=0;//     .line 74
a=0;//     .restart local v8    # "l":I
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v8=(Integer);v9=(Uninit);v10=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v6, v0, v8}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 75
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     int-to-long v2, v8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v1, v3
a=0;// 
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->uploadedSize:J
a=0;// 
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
a=0;//     .line 78
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
a=0;//     .line 104
a=0;//     .end local v6    # "buffer":[B
a=0;//     .end local v8    # "l":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 105
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v7}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 106
a=0;//     throw v0
a=0;// 
a=0;//     .line 84
a=0;//     .restart local v6    # "buffer":[B
a=0;//     :cond_5
a=0;//     :try_start_2
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Reference,[B);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     iget-wide v9, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->length:J
a=0;// 
a=0;//     .line 85
a=0;//     .local v9, "remaining":J
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(LongLo);v10=(LongHi);
a=0;//     cmp-long v0, v9, v12
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-wide/16 v1, 0x800
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2, v9, v10}, Ljava/lang/Math;->min(JJ)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     long-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v7, v6, v0, v1}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 87
a=0;//     .restart local v8    # "l":I
a=0;//     #v8=(Integer);
a=0;//     if-eq v8, v11, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     invoke-virtual {p1, v6, v0, v8}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 91
a=0;//     int-to-long v0, v8
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sub-long/2addr v9, v0
a=0;// 
a=0;//     .line 92
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     int-to-long v2, v8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->length:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/http/client/entity/InputStreamUploadEntity;->uploadedSize:J
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
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 95
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
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
}}
