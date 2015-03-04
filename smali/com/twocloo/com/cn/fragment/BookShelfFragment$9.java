package com.twocloo.com.cn.fragment; class BookShelfFragment$9 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/BookShelfFragment$9;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BookShelfFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/BookShelfFragment;->initBookPop(Ljava/lang/String;)Landroid/widget/PopupWindow;
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
a=0;// .field private final synthetic val$pi:Ljava/lang/Integer;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Ljava/lang/Integer;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$9;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$9;->val$pi:Ljava/lang/Integer;
a=0;// 
a=0;//     .line 815
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$9;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 817
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 818
a=0;//     .local v0, "msg":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$9;->val$pi:Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 819
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 820
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$9;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$2(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 821
a=0;//     return-void
a=0;// .end method
}}
