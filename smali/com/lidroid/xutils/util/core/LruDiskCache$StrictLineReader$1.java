package com.lidroid.xutils.util.core; class LruDiskCache$StrictLineReader$1 { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader$1;
a=0;// .super Ljava/io/ByteArrayOutputStream;
a=0;// .source "LruDiskCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;->readLine()Ljava/lang/String;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;I)V
a=0;//     .locals 0
a=0;//     .param p2, "$anonymous0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader$1;->this$1:Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;// 
a=0;//     .line 1161
a=0;//     invoke-direct {p0, p2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 1164
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader$1;->count:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader$1;->buf:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader$1;->count:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     aget-byte v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader$1;->count:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .line 1166
a=0;//     .local v1, "length":I
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader$1;->buf:[B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader$1;->this$1:Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;// 
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;);
a=0;//     invoke-static {v5}, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;->access$0(Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v2, v3, v4, v1, v5}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 1164
a=0;//     .end local v1    # "length":I
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Integer);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader$1;->count:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1167
a=0;//     .restart local v1    # "length":I
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1168
a=0;//     .local v0, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     new-instance v2, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v2
a=0;// .end method
}}
