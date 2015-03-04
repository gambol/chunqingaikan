package com.twocloo.com.cn.fragment; class BookShelfFragment$11 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;->val$popwin:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     .line 849
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 853
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;->val$popwin:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
a=0;// 
a=0;//     .line 854
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 855
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u8bf7\u5148\u767b\u5f55~"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 856
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 861
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-void
a=0;// 
a=0;//     .line 860
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u6211\u7684\u8ba2\u9605"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "http://app.2cloo.com/user-bookcase?token=%s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->goGeneralActivity(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
