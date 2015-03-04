package com.twocloo.base.http; class DecompressingEntity { void a() { int a;
a=0;// .class abstract Lcom/twocloo/base/http/DecompressingEntity;
a=0;// .super Lorg/apache/http/entity/HttpEntityWrapper;
a=0;// .source "DecompressingEntity.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BUFFER_SIZE:I = 0x800
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private content:Ljava/io/InputStream;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lorg/apache/http/HttpEntity;)V
a=0;//     .locals 0
a=0;//     .param p1, "wrapped"    # Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-direct {p0, p1}, Lorg/apache/http/entity/HttpEntityWrapper;-><init>(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/twocloo/base/http/DecompressingEntity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getContent()Ljava/io/InputStream;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/DecompressingEntity;->wrappedEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isStreaming()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/DecompressingEntity;->content:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/DecompressingEntity;->wrappedEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/http/DecompressingEntity;->getDecompressingInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/base/http/DecompressingEntity;->content:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/DecompressingEntity;->content:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 77
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/DecompressingEntity;->wrappedEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/http/DecompressingEntity;->getDecompressingInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method abstract getDecompressingInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 5
a=0;//     .param p1, "outstream"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 87
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
a=0;//     .line 89
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/http/DecompressingEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 91
a=0;//     .local v1, "instream":Ljava/io/InputStream;
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     const/16 v3, 0x800
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(PosShort);
a=0;//     new-array v0, v3, [B
a=0;// 
a=0;//     .line 95
a=0;//     .local v0, "buffer":[B
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v2=(Conflicted);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .local v2, "l":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// 
a=0;//     .line 96
a=0;//     :cond_1
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1, v0, v3, v2}, Ljava/io/OutputStream;->write([BII)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     .end local v0    # "buffer":[B
a=0;//     .end local v2    # "l":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(PosShort);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 99
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 100
a=0;//     throw v3
a=0;// .end method
}}
