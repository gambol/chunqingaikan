package cn.waps; class SDKUtils { void a() { int a;
a=0;// .class public Lcn/waps/SDKUtils;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static a:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/content/Context;
a=0;// 
a=0;// .field private c:Landroid/content/pm/PackageManager;
a=0;// 
a=0;// .field private d:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;// .field private e:Landroid/os/Handler;
a=0;// 
a=0;// .field private f:Landroid/webkit/WebView;
a=0;// 
a=0;// .field private g:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private h:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private i:Lcn/waps/AppListener;
a=0;// 
a=0;// .field private j:Landroid/app/Dialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcn/waps/SDKUtils;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     iput-object p1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/app/Dialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     iput-object p1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/SDKUtils;->j:Landroid/app/Dialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Landroid/webkit/WebView;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Lcn/waps/AppListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     iput-object p1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/SDKUtils;->e:Landroid/os/Handler;
a=0;// 
a=0;//     iput-object p4, p0, Lcn/waps/SDKUtils;->g:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object p5, p0, Lcn/waps/SDKUtils;->h:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object p6, p0, Lcn/waps/SDKUtils;->i:Lcn/waps/AppListener;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/SDKUtils;->f:Landroid/webkit/WebView;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcn/waps/SDKUtils;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Lcn/waps/SDKUtils;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->g:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Lcn/waps/SDKUtils;)Landroid/widget/LinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->h:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Lcn/waps/SDKUtils;)Lcn/waps/AppListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->i:Lcn/waps/AppListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/AppListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getDisplaySize(Landroid/content/Context;)I
a=0;//     .locals 7
a=0;// 
a=0;//     const/16 v2, 0xf0
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const/16 v3, 0x2d0
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/16 v4, 0x438
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     const/16 v1, 0x140
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/16 v5, 0x1e0
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     check-cast p0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/view/Display;->getHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v0, v6, :cond_3
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosShort);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v3, :cond_2
a=0;// 
a=0;//     if-ge v0, v4, :cond_2
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_7
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     if-ne v6, v1, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     if-ge v6, v1, :cond_5
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);
a=0;//     if-lt v6, v3, :cond_6
a=0;// 
a=0;//     if-ge v6, v4, :cond_6
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);
a=0;//     if-lt v6, v4, :cond_7
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callTel(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.DIAL"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "tel:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->j:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->j:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "AppSettings"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "pref_offers_shown"
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "pref_user_id"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public closeAd()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcn/waps/cw;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/cw;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/cw;-><init>(Lcn/waps/SDKUtils;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cw;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public closeOfDialog(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "message_title"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/waps/SDKUtils;->submit(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeSubmit(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public deleteLocalFiles(Ljava/io/File;)V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/io/File;);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v3}, Lcn/waps/SDKUtils;->deleteLocalFiles(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public full_screen()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcn/waps/cz;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/cz;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/cz;-><init>(Lcn/waps/SDKUtils;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cz;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getAllPermissions()[Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v2, 0x1000
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAppInfoMap(Ljava/lang/String;)Ljava/util/Map;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.action.MAIN"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct {v0, v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.category.LAUNCHER"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v4, v0, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v3, v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     iget-object v6, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     iget-object v7, v7, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget v7, v7, Landroid/content/pm/ApplicationInfo;->icon:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v8, ""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     const-string v3, "appName"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "appIcon"
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "activityName"
a=0;// 
a=0;//     invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/util/HashMap;);v3=(Integer);v4=(Reference,Landroid/content/pm/PackageManager;);v5=(Reference,Ljava/util/List;);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getAppName()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAppVersion(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     iput-object v1, p0, Lcn/waps/SDKUtils;->c:Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->c:Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/SDKUtils;->d:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->d:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->d:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "APP_SDK"
a=0;// 
a=0;//     const-string v1, "The app is not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getBrowserPackageName(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcn/waps/SDKUtils;->getInstalled()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     const-string p1, ""
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     const-string v0, ";"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     const-string p1, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Uninit);
a=0;//     const-string v0, ";"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_3
a=0;// 
a=0;//     aget-object v3, v2, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     aget-object p1, v2, v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #p1=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const-string p1, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getHtml(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput-object p1, Lcn/waps/SDKUtils;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getImsi()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "phone"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getInstalled()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/SDKUtils;->c:Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/SDKUtils;->c:Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v4, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     iget v4, v4, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     and-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     if-gtz v4, :cond_1
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, ";"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/pm/PackageInfo;);v2=(Integer);v3=(Reference,Ljava/util/List;);v4=(Integer);v5=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getLanguageCode()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getList(Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "[;]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "\\[;\\]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     aget-object v3, v2, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public getMac_Address()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "ACCESS_WIFI_STATE"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/waps/SDKUtils;->hasThePermission(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "wifi"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "APP_SDK"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Permission.ACCESS_WIFI_STATE is not found or the device is Emulator, Please check it!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getNetDataToStream(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Lcn/waps/cs;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/cs;);
a=0;//     iget-object v2, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Lcn/waps/cs;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cs;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, p1, v2, v3}, Lcn/waps/cs;->a(Ljava/lang/String;Ljava/util/List;[B)Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/InputStream;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getNetType()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "connectivity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "mobile"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getNodeTrimValues(Lorg/w3c/dom/NodeList;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v3, v0, :cond_3
a=0;// 
a=0;//     invoke-interface {p1, v3}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/w3c/dom/Node;);
a=0;//     check-cast v0, Lorg/w3c/dom/Element;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lorg/w3c/dom/NodeList;);
a=0;//     invoke-interface {v4}, Lorg/w3c/dom/NodeList;->getLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v4}, Lorg/w3c/dom/NodeList;->getLength()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v1, v5, :cond_2
a=0;// 
a=0;//     invoke-interface {v4, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lorg/w3c/dom/Node;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v5}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "[;]"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "a[;]"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v3, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_3
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Lorg/w3c/dom/Element;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public getResponseResult(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-static {v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getRunningAppPackageNames()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "activity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/waps/SDKUtils;->getInstalled()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, ";"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getScreenStatus()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     const-string v0, "false"
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getUdid()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcn/waps/AppConnect;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "phone"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "mac"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/waps/SDKUtils;->getMac_Address()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ":"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v0
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v5
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public goToTargetBrowser(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1, p2}, Lcn/waps/SDKUtils;->goToTargetBrowser_Intent(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public goToTargetBrowser_Intent(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1, v0, p2}, Lcn/waps/SDKUtils;->goToTargetBrowser_Intent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public goToTargetBrowser_Intent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcn/waps/SDKUtils;->getInstalled()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.intent.category.DEFAULT"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/net/Uri;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public hasThePermission(Ljava/lang/String;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcn/waps/SDKUtils;->getAllPermissions()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     array-length v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {p1}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Reference,[Ljava/lang/String;);v3=(Integer);v4=(Boolean);v5=(Boolean);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public hideAd()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcn/waps/cx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/cx;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/cx;-><init>(Lcn/waps/SDKUtils;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cx;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public initAdWidth()I
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isCmwap()Z
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "connectivity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->l()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isConnect()Z
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "connectivity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isInstalled(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v0, "false"
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isTimeLimited(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     new-instance v2, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v0, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v3, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v0, "yyyy-MM-dd"
a=0;// 
a=0;//     invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v4, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v0, "HH:mm:ss"
a=0;// 
a=0;//     invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "1970-01-01"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, " "
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "1970-01-01"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/Date;->before(Ljava/util/Date;)Z
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Date;);v2=(Reference,Ljava/text/SimpleDateFormat;);v3=(Reference,Ljava/text/SimpleDateFormat;);v4=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/util/Date;);v2=(Reference,Ljava/text/SimpleDateFormat;);v3=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v4=(Reference,Ljava/text/SimpleDateFormat;);v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isVisible()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->hasWindowFocus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "false"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isWapNetwork()Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isWifi()Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "connectivity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "mobile"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "wifi"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/net/NetworkInfo;);v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/net/NetworkInfo;);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public load(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/SDKUtils;->c:Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->c:Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/Intent;);v1=(Uninit);
a=0;//     const-string v0, "APP_SDK"
a=0;// 
a=0;//     const-string v1, "The app is not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public loadStreamFromLocal(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     .locals 6
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-string v0, "mounted"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public loadStringFromLocal(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 10
a=0;// 
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "mounted"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "/"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v1, v5, v7
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_d
a=0;// 
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v1, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v4, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v1, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);v4=(Reference,Ujava/lang/Object;);v5=(LongLo);v6=(LongHi);v9=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     move-object v2, v1
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v3, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v3, v5, v7
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_7
a=0;// 
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_8
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_3
a=0;// 
a=0;//     :try_start_5
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v1, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v4, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v1, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_9
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     :try_start_6
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_a
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_4
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     :cond_5
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     move-object v2, v1
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     :cond_8
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_4
a=0;//     #v4=(Conflicted);v9=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v4=(Reference,Ujava/lang/Object;);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);v2=(Null);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_5
a=0;//     :try_start_9
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);v2=(Reference,Ljava/io/FileInputStream;);v9=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_5
a=0;// 
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     :cond_a
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Null);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     :goto_6
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);v3=(Reference,Ljava/io/FileInputStream;);v9=(Conflicted);
a=0;//     if-eqz v3, :cond_b
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     :cond_b
a=0;//     if-eqz v2, :cond_c
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
a=0;// 
a=0;//     :cond_c
a=0;//     :goto_7
a=0;//     throw v0
a=0;// 
a=0;//     :catch_5
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v5=(LongLo);v6=(LongHi);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_3
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_4
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_5
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_6
a=0;//     #v1=(Conflicted);v2=(Null);v5=(LongLo);v6=(LongHi);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_7
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_8
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v9, v2
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/BufferedReader;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     move-object v1, v9
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_9
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/io/FileInputStream;);v5=(LongLo);v6=(LongHi);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_a
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Byte);v2=(Null);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public openAd()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcn/waps/SDKUtils;->openAd(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public openAd(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcn/waps/cy;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/cy;);
a=0;//     invoke-direct {v1, p0, p1}, Lcn/waps/cy;-><init>(Lcn/waps/SDKUtils;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cy;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public openAppByUri(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/waps/cs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/cs;);
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcn/waps/cs;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cs;);
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1, p2, p3}, Lcn/waps/cs;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public openUrlByBrowser(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/SDKUtils;->getBrowserPackageName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v0, p2}, Lcn/waps/SDKUtils;->goToTargetBrowser(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/net/Uri;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public openUrlByBrowser_Intent(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/SDKUtils;->getBrowserPackageName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v0, p2}, Lcn/waps/SDKUtils;->goToTargetBrowser_Intent(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/net/Uri;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public replaceData(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "a"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "a"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method public saveDataToLocal(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0x2800
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(PosShort);
a=0;//     new-array v2, v2, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     const-string v3, "mounted"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v4, v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);v1=(Integer);
a=0;//     invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eq v1, v6, :cond_4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v2, v3, v1}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v7, v1
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Null);v2=(Reference,[B);v3=(Reference,Ljava/io/File;);v4=(Reference,Ljava/io/File;);v5=(Reference,Ljava/lang/String;);v7=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);v1=(Integer);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);v3=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz p4, :cond_8
a=0;// 
a=0;//     :try_start_4
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, p2, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v0, 0x2800
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Reference,[B);v2=(Integer);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eq v2, v6, :cond_8
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v0, v3, v2}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Null);v1=(Null);v2=(Reference,[B);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, p2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v2, 0x2800
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     new-array v2, v2, [B
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Reference,[B);v3=(Integer);
a=0;//     invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eq v3, v6, :cond_7
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v2, v4, v3}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_7
a=0;//     throw v0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Null);v2=(Reference,[B);v3=(Integer);v4=(Reference,Ljava/lang/String;);v5=(Uninit);v7=(Uninit);
a=0;//     move p4, v0
a=0;// 
a=0;//     #p4=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Reference,Ljava/lang/Object;);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);p4=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_3
a=0;//     #v4=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catchall_1
a=0;//     #v1=(Integer);v2=(Reference,[B);v3=(Reference,Ljava/io/File;);v4=(Reference,Ljava/io/File;);v5=(Reference,Ljava/lang/String;);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v7, v1
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
a=0;// 
a=0;// .method public saveDataToLocal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "mounted"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {v0, v2}, Ljava/io/FileOutputStream;->write([B)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     :goto_0
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);v5=(Conflicted);
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, p2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Reference,Ujava/lang/Object;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_4
a=0;//     #v0=(Null);v1=(Null);v2=(Reference,[B);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v3, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, p2, v4}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move p4, v0
a=0;// 
a=0;//     #p4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v4=(Reference,Ljava/io/File;);v5=(Conflicted);p4=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_5
a=0;//     throw v0
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_1
a=0;//     #v1=(Null);v2=(Reference,[B);v3=(Reference,Ljava/io/File;);v4=(Reference,Ljava/io/File;);v5=(Reference,Ljava/lang/String;);v6=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v6, v1
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_4
a=0;//     #v1=(Null);v6=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v6, v1
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Null);v6=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sendSMS(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.SENDTO"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "smsto:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "sms_body"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shareTo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 7
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/a/a;->a(Landroid/content/Context;)Lcn/waps/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcn/waps/a/a;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shareTo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[I)V
a=0;//     .locals 7
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/a/a;->a(Landroid/content/Context;)Lcn/waps/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcn/waps/a/a;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showToast(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public splitString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p1, v0, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     move-object p3, p2
a=0;// 
a=0;//     :cond_3
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {p1, p3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v0, v2
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);v3=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p1, v0, v2
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public submit(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     iget-object v1, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u786e\u5b9a"
a=0;// 
a=0;//     new-instance v2, Lcn/waps/cv;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/waps/cv;);
a=0;//     invoke-direct {v2, p0}, Lcn/waps/cv;-><init>(Lcn/waps/SDKUtils;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/cv;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/SDKUtils;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
