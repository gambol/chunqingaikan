package com.twocloo.com.cn.threads; class SynUpBook { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/SynUpBook;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SynUpBook.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private add:Ljava/lang/String;
a=0;// 
a=0;// .field private del:Ljava/lang/String;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "token"    # Ljava/lang/String;
a=0;//     .param p4, "add"    # Ljava/lang/String;
a=0;//     .param p5, "del"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/SynUpBook;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/SynUpBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 16
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/SynUpBook;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 17
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/SynUpBook;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 18
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/threads/SynUpBook;->add:Ljava/lang/String;
a=0;// 
a=0;//     .line 19
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/threads/SynUpBook;->del:Ljava/lang/String;
a=0;// 
a=0;//     .line 20
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/SynUpBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/SynUpBook;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/SynUpBook;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SynUpBook;->add:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/threads/SynUpBook;->del:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3, v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->synMyfavor(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 27
a=0;//     .local v0, "json":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-void
a=0;// .end method
}}
