package com.twocloo.base.alipay; class MobileSecurePayer$2 { void a() { int a;
a=0;// .class Lcom/twocloo/base/alipay/MobileSecurePayer$2;
a=0;// .super Lcom/alipay/android/app/IRemoteServiceCallback$Stub;
a=0;// .source "MobileSecurePayer.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/base/alipay/MobileSecurePayer;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/base/alipay/MobileSecurePayer;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/alipay/MobileSecurePayer;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/alipay/MobileSecurePayer$2;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayer;
a=0;// 
a=0;//     .line 157
a=0;//     invoke-direct {p0}, Lcom/alipay/android/app/IRemoteServiceCallback$Stub;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayer$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isHideLoadingScreen()Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public payEnd(ZLjava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "arg0"    # Z
a=0;//     .param p2, "arg1"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActivity(Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "packageName"    # Ljava/lang/String;
a=0;//     .param p2, "className"    # Ljava/lang/String;
a=0;//     .param p3, "iCallingPid"    # I
a=0;//     .param p4, "bundle"    # Landroid/os/Bundle;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.MAIN"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 168
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     if-nez p4, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     new-instance p4, Landroid/os/Bundle;
a=0;// 
a=0;//     .end local p4    # "bundle":Landroid/os/Bundle;
a=0;//     #p4=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {p4}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 173
a=0;//     .restart local p4    # "bundle":Landroid/os/Bundle;
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #p4=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "CallingPid"
a=0;// 
a=0;//     invoke-virtual {p4, v2, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual {v1, p4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 179
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v1, p1, p2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v2, p0, Lcom/twocloo/base/alipay/MobileSecurePayer$2;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayer;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/base/alipay/MobileSecurePayer;->access$2(Lcom/twocloo/base/alipay/MobileSecurePayer;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 183
a=0;//     return-void
a=0;// 
a=0;//     .line 175
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 176
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
