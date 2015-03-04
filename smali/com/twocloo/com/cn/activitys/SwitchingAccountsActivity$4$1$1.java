package com.twocloo.com.cn.activitys; class SwitchingAccountsActivity$4$1$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SwitchingAccountsActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->run()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$2:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;
a=0;// 
a=0;// .field private final synthetic val$profileUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;Ljava/lang/String;Lcom/twocloo/com/cn/beans/User;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;->this$2:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;->val$profileUrl:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;->val$user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     .line 333
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 337
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;->val$profileUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/http/HttpImpl;->downLoadImage(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 338
a=0;//     .local v0, "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_USER_ICON_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;->val$user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "_"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 339
a=0;//     const-string v3, "2clooicon.cach"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 338
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/com/cn/common/Util;->savePhotoToSd(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 340
a=0;//     return-void
a=0;// .end method
}}
