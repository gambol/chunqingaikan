package com.twocloo.com.cn.activitys; class NovelDetailedActivity$10 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NovelDetailedActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->onClick(Landroid/view/View;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     .line 933
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 937
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$63(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     .line 938
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 939
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     .line 940
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 939
a=0;//     #v3=(Null);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 947
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Landroid/os/Handler;);
a=0;//     return-void
a=0;// 
a=0;//     .line 945
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v3=(Uninit);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$47(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$64(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/twocloo/com/cn/common/ShareToSNS;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 946
a=0;//     .local v0, "share":Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/common/ShareToSNS;->shareWeixin(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
