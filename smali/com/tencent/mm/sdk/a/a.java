package com.tencent.mm.sdk.a; class a { void a() { int a;
a=0;// .class public final Lcom/tencent/mm/sdk/a/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/mm/sdk/a/a$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;Lcom/tencent/mm/sdk/a/a$a;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const v6, 0x22010003
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v1, "MicroMsg.SDK.MMessageAct"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "send fail, invalid argument"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p1, Lcom/tencent/mm/sdk/a/a$a;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/tencent/mm/sdk/b/c;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.MMessageAct"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "send fail, invalid targetPkgName, targetPkgName = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p1, Lcom/tencent/mm/sdk/a/a$a;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v2, p1, Lcom/tencent/mm/sdk/a/a$a;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/tencent/mm/sdk/b/c;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p1, Lcom/tencent/mm/sdk/a/a$a;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".wxapi.WXEntryActivity"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p1, Lcom/tencent/mm/sdk/a/a$a;->i:Ljava/lang/String;
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "MicroMsg.SDK.MMessageAct"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "send, targetPkgName = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p1, Lcom/tencent/mm/sdk/a/a$a;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", targetClassName = "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p1, Lcom/tencent/mm/sdk/a/a$a;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/mm/sdk/b/a;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v3, p1, Lcom/tencent/mm/sdk/a/a$a;->h:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p1, Lcom/tencent/mm/sdk/a/a$a;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v3, p1, Lcom/tencent/mm/sdk/a/a$a;->k:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     iget-object v3, p1, Lcom/tencent/mm/sdk/a/a$a;->k:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "_mmessage_sdkVersion"
a=0;// 
a=0;//     invoke-virtual {v2, v4, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v4, "_mmessage_appPackage"
a=0;// 
a=0;//     invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v4, "_mmessage_content"
a=0;// 
a=0;//     iget-object v5, p1, Lcom/tencent/mm/sdk/a/a$a;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v4, "_mmessage_checksum"
a=0;// 
a=0;//     iget-object v5, p1, Lcom/tencent/mm/sdk/a/a$a;->j:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5, v6, v3}, Lcom/tencent/mm/sdk/a/a/b;->a(Ljava/lang/String;ILjava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;
a=0;// 
a=0;//     iget v3, p1, Lcom/tencent/mm/sdk/a/a$a;->flags:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v3, v4, :cond_5
a=0;// 
a=0;//     const/high16 v3, 0x10000000
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v4, 0x8000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const-string v0, "MicroMsg.SDK.MMessageAct"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "send mm message, intent="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/mm/sdk/b/a;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Null);v3=(Integer);v4=(Byte);
a=0;//     iget v3, p1, Lcom/tencent/mm/sdk/a/a$a;->flags:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Integer);
a=0;//     move-exception v2
a=0;// 
a=0;//     const-string v3, "MicroMsg.SDK.MMessageAct"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "send fail, ex = %s"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     invoke-static {v3, v4, v1}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
