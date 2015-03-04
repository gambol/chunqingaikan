package com.actionbarsherlock.internal; class ActionBarSherlockNative$ActionModeCallbackWrapper { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarSherlockNative.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/ActionMode$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ActionModeCallbackWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;Lcom/actionbarsherlock/view/ActionMode$Callback;)V
a=0;//     .locals 0
a=0;//     .param p2, "callback"    # Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 225
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;);
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     .line 226
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
a=0;//     .locals 3
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode$Callback;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;)Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative;);
a=0;//     invoke-static {v2}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;)Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->getMenu()Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->findItem(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onActionItemClicked(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
a=0;//     .locals 3
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative;);
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative;);
a=0;//     invoke-direct {v1, v2, p1}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;-><init>(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;Landroid/view/ActionMode;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$0(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;)V
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;)Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;)Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->getMenu()Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onCreateActionMode(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroyActionMode(Landroid/view/ActionMode;)V
a=0;//     .locals 2
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode$Callback;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;)Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onDestroyActionMode(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$2(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     instance-of v0, v0, Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeFinishedListener;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$2(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeFinishedListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;)Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeFinishedListener;->onActionModeFinished(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     .line 252
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
a=0;//     .locals 3
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode$Callback;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;)Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative;);
a=0;//     invoke-static {v2}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;)Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->getMenu()Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onPrepareActionMode(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
