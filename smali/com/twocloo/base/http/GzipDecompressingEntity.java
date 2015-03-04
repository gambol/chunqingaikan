package com.twocloo.base.http; class GzipDecompressingEntity { void a() { int a;
a=0;// .class public Lcom/twocloo/base/http/GzipDecompressingEntity;
a=0;// .super Lcom/twocloo/base/http/DecompressingEntity;
a=0;// .source "GzipDecompressingEntity.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lorg/apache/http/HttpEntity;)V
a=0;//     .locals 0
a=0;//     .param p1, "entity"    # Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/http/DecompressingEntity;-><init>(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Lcom/twocloo/base/http/GzipDecompressingEntity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic getContent()Ljava/io/InputStream;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-super {p0}, Lcom/twocloo/base/http/DecompressingEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentEncoding()Lorg/apache/http/Header;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
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
a=0;//     .line 77
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method getDecompressingInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;
a=0;//     .locals 1
a=0;//     .param p1, "wrapped"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     new-instance v0, Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/GZIPInputStream;);
a=0;//     invoke-direct {v0, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/zip/GZIPInputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-super {p0, p1}, Lcom/twocloo/base/http/DecompressingEntity;->writeTo(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
