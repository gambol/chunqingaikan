package com.twocloo.com.cn.activitys; class PinglunActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/PinglunActivity$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PinglunActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/PinglunActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener",
a=0;//         "<",
a=0;//         "Landroid/widget/ListView;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/PinglunActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     .line 120
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onRefresh(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
a=0;//             "<",
a=0;//             "Landroid/widget/ListView;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "refreshView":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<Landroid/widget/ListView;>;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 124
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$1(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ShupingThread;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Shupinginfo;->getTotal_page_number()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$5()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$6(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 139
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 130
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$5()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$7(I)V
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$6(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$8(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$5()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$9(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/twocloo/com/cn/threads/ShupingThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;IILandroid/widget/TextView;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     invoke-static {v9, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$10(Lcom/twocloo/com/cn/activitys/PinglunActivity;Lcom/twocloo/com/cn/threads/ShupingThread;)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$1(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/ShupingThread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 134
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 135
a=0;//     .local v8, "msg":Landroid/os/Message;
a=0;//     #v8=(Reference,Landroid/os/Message;);
a=0;//     const/16 v0, 0x6f
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v8, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->access$6(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u5df2\u65e0\u66f4\u591a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
