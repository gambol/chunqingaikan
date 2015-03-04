package safiap.framework; class d { void a() { int a;
a=0;// .class final Lsafiap/framework/d;
a=0;// .super Lsafiap/framework/sdk/ISAFFramework$Stub;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lsafiap/framework/SafFrameworkManager;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 952
a=0;//     iput-object p1, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-direct {p0}, Lsafiap/framework/sdk/ISAFFramework$Stub;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final cancel(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1086
a=0;//     iget-object v0, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0, p1}, Lsafiap/framework/SafFrameworkManager;->b(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final cancelAll()Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1095
a=0;//     iget-object v0, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->d(Lsafiap/framework/SafFrameworkManager;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final checkIAPinstallation()Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1136
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final checkServiceVersion()Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1191
a=0;//     iget-object v0, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/sdk/b/d;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1193
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final downloadPlugin(Lsafiap/framework/sdk/ISAFFrameworkCallback;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1061
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 1062
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1065
a=0;//     iget-object v0, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager;->b:Lsafiap/framework/b;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1066
a=0;//     iget-object v0, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager;->b:Lsafiap/framework/b;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, p2, v1}, Lsafiap/framework/b;->a(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1069
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 1070
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1071
a=0;//     iget-object v0, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->e(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/b$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, p2, v1, v2}, Lsafiap/framework/b$a;->a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1075
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFrameworkCallback;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static/range {v0 .. v5}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Lsafiap/framework/sdk/ISAFFrameworkCallback;Ljava/lang/String;IZZ)V
a=0;// 
a=0;//     .line 1077
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getFrameworkVersion()I
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1115
a=0;//     iget-object v0, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final getIAPDedicateActionName()Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1154
a=0;//     .line 1158
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.action.MAIN"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 1159
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v3, Lsafiap/framework/util/Constants;->SAF_COMPONENT_KEY:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1161
a=0;//     iget-object v3, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v3}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1162
a=0;//     invoke-virtual {v3, v2, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1163
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 1185
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);v1=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1166
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "checking appsInfos.size():("
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, ") "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 1167
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v2=(Integer);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v3, v0, :cond_1
a=0;// 
a=0;//     .line 1168
a=0;//     invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 1170
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "checking signature RIGHT!!!activeInfo: ("
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ")  and  Package Name: "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     iget-object v7, v7, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v7, v7, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " and P: "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget v7, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1173
a=0;//     iget v5, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-le v5, v2, :cond_2
a=0;// 
a=0;//     .line 1174
a=0;//     iget v1, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     .line 1175
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 1176
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Updating : "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1167
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v2, v3, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1181
a=0;//     :cond_1
a=0;//     #v0=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getIAPDedicateActionName : "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Integer);v3=(Integer);v5=(Integer);v6=(Reference,Ljava/lang/String;);v7=(Integer);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final getPluginInfo(Ljava/lang/String;)I
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 959
a=0;//     #v3=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1045
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 965
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Boolean);v2=(One);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "getPluginInfo...start, actionName: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 969
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 970
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v2, "getPluginInfo().Framework service: QUERY NOT IAP_COMPONENT_SERVICE_ACTION"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 974
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(One);
a=0;//     iget-object v1, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/sdk/b/d;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 976
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "ServiceVersion in the Minifest is error!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 977
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 981
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Boolean);
a=0;//     iget-object v1, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v1, p1}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 982
a=0;//     #v1=(Integer);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "getPluginInfo().syncVersionInfo.actionName:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ",syncResult:"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 983
a=0;//     if-ne v1, v0, :cond_3
a=0;// 
a=0;//     .line 984
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v2, "getPluginInfo().Framework service:RESULT_CODE_PLUGIN_NOT_EXIST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 985
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 989
a=0;//     :cond_3
a=0;//     #v0=(Byte);v2=(One);
a=0;//     iget-object v1, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->f(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 990
a=0;//     iget-object v1, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     iget-object v4, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v4}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1, v4}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Lsafiap/framework/a/c;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     .line 993
a=0;//     :cond_4
a=0;//     iget-object v1, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->f(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v4, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Lsafiap/framework/a/c;->f(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_f
a=0;// 
a=0;//     .line 995
a=0;//     const/16 v0, -0x1f4
a=0;// 
a=0;//     #v0=(Short);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 998
a=0;//     :goto_1
a=0;//     iget-object v4, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v4}, Lsafiap/framework/SafFrameworkManager;->f(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v5, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lsafiap/framework/a/c;->g(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_e
a=0;// 
a=0;//     .line 1000
a=0;//     const/16 v0, -0x12c
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     .line 1004
a=0;//     :goto_2
a=0;//     iget-object v5, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v5}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget-object v6, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5, v6}, Lsafiap/framework/sdk/b/d;->d(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1005
a=0;//     #v5=(Integer);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, " current highest iap version: "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1007
a=0;//     iget-object v6, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v6}, Lsafiap/framework/SafFrameworkManager;->f(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget-object v7, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lsafiap/framework/a/c;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1008
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_6
a=0;// 
a=0;//     if-le v6, v5, :cond_6
a=0;// 
a=0;//     move v5, v2
a=0;// 
a=0;//     .line 1009
a=0;//     :goto_3
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 1014
a=0;//     :cond_5
a=0;//     #v4=(Boolean);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "getPluginInfo().in database,server highest version,plugin:"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v7, v6}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1020
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "IAPPluginHasDownloadFile"
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1021
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     .line 1022
a=0;//     iget-object v1, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-virtual {v1, v5}, Lsafiap/framework/SafFrameworkManager;->a(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v5=(Integer);v6=(Integer);v9=(Uninit);
a=0;//     move v5, v3
a=0;// 
a=0;//     .line 1008
a=0;//     #v5=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1026
a=0;//     :cond_7
a=0;//     #v5=(Boolean);v6=(Reference,Lsafiap/framework/util/MyLogger;);v9=(Reference,Ljava/lang/String;);
a=0;//     sget-boolean v6, Lsafiap/framework/util/Constants;->sIsIAPtestVersion:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     .line 1027
a=0;//     if-nez v5, :cond_8
a=0;// 
a=0;//     if-nez v4, :cond_8
a=0;// 
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 1032
a=0;//     :cond_8
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "getPluginInfo().pulginMustUpdate:"
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ", IAPPluginHasUpdate:"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1033
a=0;//     invoke-static {v4}, Lsafiap/framework/SafFrameworkManager;->b(Z)Z
a=0;// 
a=0;//     .line 1034
a=0;//     if-nez v4, :cond_9
a=0;// 
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     .line 1035
a=0;//     :cond_9
a=0;//     iget-object v5, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     if-nez v4, :cond_a
a=0;// 
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     :cond_a
a=0;//     move v3, v2
a=0;// 
a=0;//     :cond_b
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v5, v3, v1}, Lsafiap/framework/SafFrameworkManager;->a(ZZ)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1040
a=0;//     :cond_c
a=0;//     #v3=(Null);
a=0;//     if-nez v4, :cond_d
a=0;// 
a=0;//     if-nez v1, :cond_d
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 1044
a=0;//     :cond_d
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getPluginInfo().checkResult:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_e
a=0;//     #v1=(Boolean);v2=(One);v3=(Null);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Byte);v4=(Reference,Ljava/lang/String;);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final hasUpdate()Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1105
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final startCheckUpdate(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1127
a=0;//     iget-object v0, p0, Lsafiap/framework/d;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0, p1}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1128
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final startIAPInstall()V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1145
a=0;//     return-void
a=0;// .end method
}}
