package cn.sharesdk.framework; class ShareSDKUIShell { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/ShareSDKUIShell;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcn/sharesdk/framework/FakeActivity;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcn/sharesdk/framework/ShareSDKUIShell;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/ShareSDKUIShell;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcn/sharesdk/framework/FakeActivity;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p0}, Lcn/sharesdk/framework/ShareSDKUIShell;->a(Ljava/lang/String;Lcn/sharesdk/framework/FakeActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;Lcn/sharesdk/framework/FakeActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/ShareSDKUIShell;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public finish()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/FakeActivity;->onFinish()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcn/sharesdk/framework/FakeActivity;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/FakeActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/utils/UIHandler;->prepare()V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/ShareSDKUIShell;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v0, "launch_time"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lcn/sharesdk/framework/ShareSDKUIShell;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcn/sharesdk/framework/ShareSDKUIShell;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Executor lost! launchTime = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/ShareSDKUIShell;->finish()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "ShareSDKUIShell found executor: "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcn/sharesdk/framework/FakeActivity;->setActivity(Landroid/app/Activity;)V
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/FakeActivity;->onCreate()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/FakeActivity;->sendResult()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/FakeActivity;->onDestroy()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/FakeActivity;->onKeyEvent(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/FakeActivity;->onKeyEvent(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/FakeActivity;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/FakeActivity;->onPause()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRestart()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/FakeActivity;->onRestart()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onRestart()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/FakeActivity;->onResume()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStart()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/FakeActivity;->onStart()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStart()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/FakeActivity;->onStop()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/ShareSDKUIShell;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/FakeActivity;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/FakeActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/ShareSDKUIShell;->b:Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/FakeActivity;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
