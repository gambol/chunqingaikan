package com.twocloo.com.cn.fragment; class BookShelfFragment$12 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BookShelfFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/BookShelfFragment;->initMorePop()Landroid/widget/PopupWindow;
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
a=0;// .field private final synthetic val$popwin:Landroid/widget/PopupWindow;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Landroid/widget/PopupWindow;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;->val$popwin:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     .line 865
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 7
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 869
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;->val$popwin:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V
a=0;// 
a=0;//     .line 870
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 871
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 881
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 874
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u6b63\u5728\u540c\u6b65\u4e66\u67b6\uff0c\u8bf7\u7a0d\u540e..."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$27(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     .line 875
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$16(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 876
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 877
a=0;//     .local v6, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 878
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/SyncBFBookThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getHandler()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/threads/SyncBFBookThread;-><init>(Landroid/support/v4/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Z)V
a=0;// 
a=0;//     .line 879
a=0;//     .local v0, "syncT":Lcom/twocloo/com/cn/threads/SyncBFBookThread;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SyncBFBookThread;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
