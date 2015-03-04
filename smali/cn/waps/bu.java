package cn.waps; class bu { void a() { int a;
a=0;// .class Lcn/waps/bu;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnKeyListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/app/Dialog;
a=0;// 
a=0;// .field final synthetic b:Landroid/webkit/WebView;
a=0;// 
a=0;// .field final synthetic c:Lcn/waps/bp;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/bp;Landroid/app/Dialog;Landroid/webkit/WebView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/bu;->c:Lcn/waps/bp;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/bu;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/bu;->b:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/bu;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne p2, v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/bu;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/bp;);
a=0;//     invoke-static {v2}, Lcn/waps/bp;->j(Lcn/waps/bp;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/bu;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/bu;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v2}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/bu;->c:Lcn/waps/bp;
a=0;// 
a=0;//     iget-object v2, v2, Lcn/waps/bp;->i:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "pref_offers_shown"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "pref_user_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcn/waps/bu;->b:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v2}, Landroid/webkit/WebView;->canGoBack()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/bu;->b:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v1}, Landroid/webkit/WebView;->goBack()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcn/waps/bu;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/bu;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v2}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/bu;->c:Lcn/waps/bp;
a=0;// 
a=0;//     iget-object v2, v2, Lcn/waps/bp;->i:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "pref_offers_shown"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "pref_user_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Null);v2=(Integer);v3=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
