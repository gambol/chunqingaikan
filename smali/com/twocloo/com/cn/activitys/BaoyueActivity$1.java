package com.twocloo.com.cn.activitys; class BaoyueActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;
a=0;// .super Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// .source "BaoyueActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/BaoyueActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//         "<",
a=0;//         "Lcom/twocloo/com/cn/beans/SubResultBean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/BaoyueActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/BaoyueActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BaoyueActivity;
a=0;// 
a=0;//     .line 90
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/singlebook/DataCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callBack(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;//     .locals 4
a=0;//     .param p1, "t"    # Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 93
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SubResultBean;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BaoyueActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaoyueActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->access$0(Lcom/twocloo/com/cn/activitys/BaoyueActivity;)V
a=0;// 
a=0;//     .line 102
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     const-string v1, "2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BaoyueActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaoyueActivity;);
a=0;//     const-string v2, "\u5305\u6708\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     const-string v1, "3"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BaoyueActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaoyueActivity;);
a=0;//     const-string v2, "\u7eed\u8ba2\u5305\u6708\u6210\u529f."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BaoyueActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaoyueActivity;);
a=0;//     const-string v2, "\u4f59\u989d\u4e0d\u8db3\uff0c\u8bf7\u5145\u503c."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic callBack(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;->callBack(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
