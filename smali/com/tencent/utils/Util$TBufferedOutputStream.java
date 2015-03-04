package com.tencent.utils; class Util$TBufferedOutputStream { void a() { int a;
a=0;// .class Lcom/tencent/utils/Util$TBufferedOutputStream;
a=0;// .super Ljava/io/BufferedOutputStream;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/utils/Util;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "TBufferedOutputStream"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/OutputStream;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     invoke-direct {p0, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 233
a=0;//     #p0=(Reference,Lcom/tencent/utils/Util$TBufferedOutputStream;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/utils/Util$TBufferedOutputStream;->a:I
a=0;// 
a=0;//     .line 234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getLength()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     iget v0, p0, Lcom/tencent/utils/Util$TBufferedOutputStream;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public write([B)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     invoke-super {p0, p1}, Ljava/io/BufferedOutputStream;->write([B)V
a=0;// 
a=0;//     .line 239
a=0;//     iget v0, p0, Lcom/tencent/utils/Util$TBufferedOutputStream;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/utils/Util$TBufferedOutputStream;->a:I
a=0;// 
a=0;//     .line 240
a=0;//     return-void
a=0;// .end method
}}
