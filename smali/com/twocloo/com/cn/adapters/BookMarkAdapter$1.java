package com.twocloo.com.cn.adapters; class BookMarkAdapter$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BookMarkAdapter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;// .field private final synthetic val$beg:I
a=0;// 
a=0;// .field private final synthetic val$bm:Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;// .field private final synthetic val$textid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;Lcom/twocloo/com/cn/beans/BookMark;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->val$bm:Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->val$beg:I
a=0;// 
a=0;//     .line 85
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->access$0(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 89
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "aid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->val$bm:Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMark;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 90
a=0;//     const-string v1, "textid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 91
a=0;//     const-string v1, "beg"
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->val$beg:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 92
a=0;//     const-string v1, "Tag"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->access$1(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 93
a=0;//     const-string v1, "isVip"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->val$bm:Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMark;->getIsV()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 94
a=0;//     const/high16 v1, 0x4000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->access$0(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->access$0(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// .end method
}}
