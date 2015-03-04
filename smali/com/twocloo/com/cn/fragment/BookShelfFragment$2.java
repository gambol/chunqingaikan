package com.twocloo.com.cn.fragment; class BookShelfFragment$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BookShelfFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/BookShelfFragment;->checkShelfDatas(Ljava/util/Vector;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;// .field private final synthetic val$bfb:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Lcom/twocloo/com/cn/beans/BFBook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;->val$bfb:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 472
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;->val$bfb:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/com/cn/http/HttpImpl;->checkBFBook(Landroid/app/Activity;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 476
a=0;//     .local v1, "jo":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/http/HttpImpl;->parseJson(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 477
a=0;//     .local v0, "bf":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;->val$bfb:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v0, v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$18(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Lcom/twocloo/com/cn/beans/BFBook;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 478
a=0;//     return-void
a=0;// .end method
}}
