package com.twocloo.com.cn.activitys; class ManageBookShelf$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ManageBookShelf.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     .line 75
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     #v3=(Null);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 93
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// 
a=0;//     .line 80
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$0(Lcom/twocloo/com/cn/activitys/ManageBookShelf;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$1(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\t\u66f4\u65b0\u5931\u8d25."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 87
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$0(Lcom/twocloo/com/cn/activitys/ManageBookShelf;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$1(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\t\u66f4\u65b0\u6210\u529f."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x14f
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
