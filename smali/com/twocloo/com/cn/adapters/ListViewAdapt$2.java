package com.twocloo.com.cn.adapters; class ListViewAdapt$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ListViewAdapt.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnLongClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/adapters/ListViewAdapt;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/adapters/ListViewAdapt;
a=0;// 
a=0;// .field private final synthetic val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;// .field private final synthetic val$p:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/adapters/ListViewAdapt;Lcom/twocloo/com/cn/beans/BFBook;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;->this$0:Lcom/twocloo/com/cn/adapters/ListViewAdapt;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;->val$p:I
a=0;// 
a=0;//     .line 228
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onLongClick(Landroid/view/View;)Z
a=0;//     .locals 5
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 231
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 232
a=0;//     new-instance v1, Landroid/os/Message;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v1}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 233
a=0;//     .local v1, "msg":Landroid/os/Message;
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 234
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     new-array v0, v2, [I
a=0;// 
a=0;//     .line 235
a=0;//     .local v0, "location":[I
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V
a=0;// 
a=0;//     .line 236
a=0;//     aget v2, v0, v4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 237
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget v2, v0, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     .line 238
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;->val$p:I
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;->this$0:Lcom/twocloo/com/cn/adapters/ListViewAdapt;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 243
a=0;//     .end local v0    # "location":[I
a=0;//     .end local v1    # "msg":Landroid/os/Message;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 241
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;->this$0:Lcom/twocloo/com/cn/adapters/ListViewAdapt;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;->val$p:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->access$0(Lcom/twocloo/com/cn/adapters/ListViewAdapt;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
