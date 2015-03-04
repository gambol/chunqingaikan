package com.lidroid.xutils.http; class RequestParams$HeaderItem { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RequestParams.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/lidroid/xutils/http/RequestParams;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1
a=0;//     name = "HeaderItem"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final header:Lorg/apache/http/Header;
a=0;// 
a=0;// .field public final overwrite:Z
a=0;// 
a=0;// .field final synthetic this$0:Lcom/lidroid/xutils/http/RequestParams;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/lidroid/xutils/http/RequestParams;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p2, "name"    # Ljava/lang/String;
a=0;//     .param p3, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 321
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->this$0:Lcom/lidroid/xutils/http/RequestParams;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 322
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->overwrite:Z
a=0;// 
a=0;//     .line 323
a=0;//     new-instance v0, Lorg/apache/http/message/BasicHeader;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/message/BasicHeader;);
a=0;//     invoke-direct {v0, p2, p3}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/message/BasicHeader;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->header:Lorg/apache/http/Header;
a=0;// 
a=0;//     .line 324
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/lidroid/xutils/http/RequestParams;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     .locals 1
a=0;//     .param p2, "name"    # Ljava/lang/String;
a=0;//     .param p3, "value"    # Ljava/lang/String;
a=0;//     .param p4, "overwrite"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 326
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->this$0:Lcom/lidroid/xutils/http/RequestParams;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 327
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     iput-boolean p4, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->overwrite:Z
a=0;// 
a=0;//     .line 328
a=0;//     new-instance v0, Lorg/apache/http/message/BasicHeader;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/message/BasicHeader;);
a=0;//     invoke-direct {v0, p2, p3}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/message/BasicHeader;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->header:Lorg/apache/http/Header;
a=0;// 
a=0;//     .line 329
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/lidroid/xutils/http/RequestParams;Lorg/apache/http/Header;)V
a=0;//     .locals 1
a=0;//     .param p2, "header"    # Lorg/apache/http/Header;
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->this$0:Lcom/lidroid/xutils/http/RequestParams;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 312
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->overwrite:Z
a=0;// 
a=0;//     .line 313
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->header:Lorg/apache/http/Header;
a=0;// 
a=0;//     .line 314
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/lidroid/xutils/http/RequestParams;Lorg/apache/http/Header;Z)V
a=0;//     .locals 0
a=0;//     .param p2, "header"    # Lorg/apache/http/Header;
a=0;//     .param p3, "overwrite"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->this$0:Lcom/lidroid/xutils/http/RequestParams;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 317
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     iput-boolean p3, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->overwrite:Z
a=0;// 
a=0;//     .line 318
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;->header:Lorg/apache/http/Header;
a=0;// 
a=0;//     .line 319
a=0;//     return-void
a=0;// .end method
}}
