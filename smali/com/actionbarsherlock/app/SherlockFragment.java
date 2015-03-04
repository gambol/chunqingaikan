package com.actionbarsherlock.app; class SherlockFragment { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/app/SherlockFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "SherlockFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/Watson$OnCreateOptionsMenuListener;
a=0;// .implements Landroid/support/v4/app/Watson$OnOptionsItemSelectedListener;
a=0;// .implements Landroid/support/v4/app/Watson$OnPrepareOptionsMenuListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActivity:Lcom/actionbarsherlock/app/SherlockFragmentActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/app/SherlockFragment;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/app/SherlockFragment;->mActivity:Lcom/actionbarsherlock/app/SherlockFragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/app/SherlockFragmentActivity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onAttach(Landroid/app/Activity;)V
a=0;//     .locals 3
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     instance-of v0, p1, Lcom/actionbarsherlock/app/SherlockFragmentActivity;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 25
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " must be attached to a SherlockFragmentActivity."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 27
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/app/SherlockFragmentActivity;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/app/SherlockFragment;->mActivity:Lcom/actionbarsherlock/app/SherlockFragmentActivity;
a=0;// 
a=0;//     .line 29
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
a=0;//     .locals 2
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;//     .param p2, "inflater"    # Landroid/view/MenuInflater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;);
a=0;//     invoke-direct {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;-><init>(Landroid/view/Menu;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/app/SherlockFragment;->mActivity:Lcom/actionbarsherlock/app/SherlockFragmentActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/app/SherlockFragmentActivity;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/app/SherlockFragment;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;//     .param p2, "inflater"    # Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetach()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/app/SherlockFragment;->mActivity:Lcom/actionbarsherlock/app/SherlockFragmentActivity;
a=0;// 
a=0;//     .line 35
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;);
a=0;//     invoke-direct {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;-><init>(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/app/SherlockFragment;->onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final onPrepareOptionsMenu(Landroid/view/Menu;)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;);
a=0;//     invoke-direct {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;-><init>(Landroid/view/Menu;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/app/SherlockFragment;->onPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)V
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
}}
