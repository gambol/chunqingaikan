package com.android.volley.toolbox; class DiskBasedCache$CountingInputStream { void a() { int a;
a=0;// .class Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;// .super Ljava/io/FilterInputStream;
a=0;// .source "DiskBasedCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/android/volley/toolbox/DiskBasedCache;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "CountingInputStream"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private bytesRead:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Ljava/io/InputStream;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Ljava/io/InputStream;
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 434
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;->bytesRead:I
a=0;// 
a=0;//     .line 438
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Ljava/io/InputStream;Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     invoke-direct {p0, p1}, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 434
a=0;//     iget v0, p0, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;->bytesRead:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public read()I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 442
a=0;//     invoke-super {p0}, Ljava/io/FilterInputStream;->read()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 443
a=0;//     .local v0, "result":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 444
a=0;//     iget v1, p0, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;->bytesRead:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;->bytesRead:I
a=0;// 
a=0;//     .line 446
a=0;//     :cond_0
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public read([BII)I
a=0;//     .locals 2
a=0;//     .param p1, "buffer"    # [B
a=0;//     .param p2, "offset"    # I
a=0;//     .param p3, "count"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 452
a=0;//     .local v0, "result":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 453
a=0;//     iget v1, p0, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;->bytesRead:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, v0
a=0;// 
a=0;//     iput v1, p0, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;->bytesRead:I
a=0;// 
a=0;//     .line 455
a=0;//     :cond_0
a=0;//     return v0
a=0;// .end method
}}
