package com.lidroid.xutils.http; class HttpCache$1 { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/http/HttpCache$1;
a=0;// .super Lcom/lidroid/xutils/util/core/LruMemoryCache;
a=0;// .source "HttpCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/lidroid/xutils/http/HttpCache;-><init>(IJ)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/lidroid/xutils/util/core/LruMemoryCache",
a=0;//         "<",
a=0;//         "Ljava/lang/String;",
a=0;//         "Ljava/lang/String;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/lidroid/xutils/http/HttpCache;I)V
a=0;//     .locals 0
a=0;//     .param p2, "$anonymous0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/HttpCache$1;->this$0:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     .line 55
a=0;//     invoke-direct {p0, p2}, Lcom/lidroid/xutils/util/core/LruMemoryCache;-><init>(I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/HttpCache$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected bridge synthetic sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     check-cast p2, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/lidroid/xutils/http/HttpCache$1;->sizeOf(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected sizeOf(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
