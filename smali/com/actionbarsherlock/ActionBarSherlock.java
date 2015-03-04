package com.actionbarsherlock; class ActionBarSherlock { void a() { int a;
a=0;// .class public abstract Lcom/actionbarsherlock/ActionBarSherlock;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarSherlock.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/ActionBarSherlock$Implementation;,
a=0;//         Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeFinishedListener;,
a=0;//         Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeStartedListener;,
a=0;//         Lcom/actionbarsherlock/ActionBarSherlock$OnCreateOptionsMenuListener;,
a=0;//         Lcom/actionbarsherlock/ActionBarSherlock$OnCreatePanelMenuListener;,
a=0;//         Lcom/actionbarsherlock/ActionBarSherlock$OnMenuItemSelectedListener;,
a=0;//         Lcom/actionbarsherlock/ActionBarSherlock$OnOptionsItemSelectedListener;,
a=0;//         Lcom/actionbarsherlock/ActionBarSherlock$OnPrepareOptionsMenuListener;,
a=0;//         Lcom/actionbarsherlock/ActionBarSherlock$OnPreparePanelListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CONSTRUCTOR_ARGS:[Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected static final DEBUG:Z = false
a=0;// 
a=0;// .field public static final FLAG_DELEGATE:I = 0x1
a=0;// 
a=0;// .field private static final IMPLEMENTATIONS:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Lcom/actionbarsherlock/ActionBarSherlock$Implementation;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcom/actionbarsherlock/ActionBarSherlock;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected static final TAG:Ljava/lang/String; = "ActionBarSherlock"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final mActivity:Landroid/app/Activity;
a=0;// 
a=0;// .field protected final mIsDelegate:Z
a=0;// 
a=0;// .field protected mMenuInflater:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-class v2, Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/actionbarsherlock/ActionBarSherlock;->CONSTRUCTOR_ARGS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/ActionBarSherlock;->IMPLEMENTATIONS:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 51
a=0;//     const-class v0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/ActionBarSherlock;->registerImplementation(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 52
a=0;//     const-class v0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/ActionBarSherlock;->registerImplementation(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected constructor <init>(Landroid/app/Activity;I)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 258
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/ActionBarSherlock;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 259
a=0;//     and-int/lit8 v0, p2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mIsDelegate:Z
a=0;// 
a=0;//     .line 260
a=0;//     return-void
a=0;// 
a=0;//     .line 259
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static registerImplementation(Ljava/lang/Class;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcom/actionbarsherlock/ActionBarSherlock;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     .local p0, "implementationClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/actionbarsherlock/ActionBarSherlock;>;"
a=0;//     const-class v1, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Class "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " is not annotated with @Implementation"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 124
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     sget-object v1, Lcom/actionbarsherlock/ActionBarSherlock;->IMPLEMENTATIONS:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, p0}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 132
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 129
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     const-class v1, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/annotation/Annotation;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;// 
a=0;//     .line 131
a=0;//     .local v0, "impl":Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;//     sget-object v1, Lcom/actionbarsherlock/ActionBarSherlock;->IMPLEMENTATIONS:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static unregisterImplementation(Ljava/lang/Class;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcom/actionbarsherlock/ActionBarSherlock;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     .local p0, "implementationClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/actionbarsherlock/ActionBarSherlock;>;"
a=0;//     sget-object v0, Lcom/actionbarsherlock/ActionBarSherlock;->IMPLEMENTATIONS:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static wrap(Landroid/app/Activity;)Lcom/actionbarsherlock/ActionBarSherlock;
a=0;//     .locals 1
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Lcom/actionbarsherlock/ActionBarSherlock;->wrap(Landroid/app/Activity;I)Lcom/actionbarsherlock/ActionBarSherlock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/ActionBarSherlock;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static wrap(Landroid/app/Activity;I)Lcom/actionbarsherlock/ActionBarSherlock;
a=0;//     .locals 15
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;//     .param p1, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     new-instance v5, Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/HashMap;);
a=0;//     sget-object v12, Lcom/actionbarsherlock/ActionBarSherlock;->IMPLEMENTATIONS:Ljava/util/HashMap;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-direct {v5, v12}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V
a=0;// 
a=0;//     .line 174
a=0;//     .local v5, "impls":Ljava/util/HashMap;, "Ljava/util/HashMap<Lcom/actionbarsherlock/ActionBarSherlock$Implementation;Ljava/lang/Class<+Lcom/actionbarsherlock/ActionBarSherlock;>;>;"
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 175
a=0;//     .local v3, "hasQualfier":Z
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_7
a=0;// 
a=0;//     .line 182
a=0;//     :goto_0
a=0;//     #v3=(Boolean);v13=(Integer);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     iget v12, v12, Landroid/util/DisplayMetrics;->densityDpi:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     const/16 v13, 0xd5
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     if-ne v12, v13, :cond_8
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 184
a=0;//     .local v6, "isTvDpi":Z
a=0;//     :goto_1
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .local v10, "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/actionbarsherlock/ActionBarSherlock$Implementation;>;"
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v9=(Conflicted);v10=(Reference,Ljava/util/Iterator;);v12=(Conflicted);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-nez v12, :cond_9
a=0;// 
a=0;//     .line 194
a=0;//     .end local v6    # "isTvDpi":Z
a=0;//     .end local v10    # "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/actionbarsherlock/ActionBarSherlock$Implementation;>;"
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 195
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_c
a=0;// 
a=0;//     .line 201
a=0;//     :goto_3
a=0;//     #v3=(Boolean);v13=(Integer);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 202
a=0;//     sget v11, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 203
a=0;//     .local v11, "runtimeApi":I
a=0;//     #v11=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 204
a=0;//     .local v0, "bestApi":I
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .restart local v10    # "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/actionbarsherlock/ActionBarSherlock$Implementation;>;"
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     #v0=(Integer);v8=(Conflicted);v10=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-nez v12, :cond_d
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_5
a=0;//     #v12=(Conflicted);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-nez v12, :cond_f
a=0;// 
a=0;//     .line 219
a=0;//     .end local v0    # "bestApi":I
a=0;//     .end local v10    # "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/actionbarsherlock/ActionBarSherlock$Implementation;>;"
a=0;//     .end local v11    # "runtimeApi":I
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     if-le v12, v13, :cond_10
a=0;// 
a=0;//     .line 220
a=0;//     new-instance v12, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v13, "More than one implementation matches configuration."
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 175
a=0;//     :cond_7
a=0;//     #v0=(Uninit);v3=(Null);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Boolean);
a=0;//     invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;// 
a=0;//     .line 177
a=0;//     .local v7, "key":Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;//     invoke-interface {v7}, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;->dpi()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     const/16 v14, 0xd5
a=0;// 
a=0;//     #v14=(PosShort);
a=0;//     if-ne v13, v14, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 179
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 183
a=0;//     .end local v7    # "key":Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;//     :cond_8
a=0;//     #v3=(Boolean);v7=(Conflicted);v12=(Integer);v13=(PosShort);v14=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 185
a=0;//     .restart local v6    # "isTvDpi":Z
a=0;//     .restart local v10    # "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/actionbarsherlock/ActionBarSherlock$Implementation;>;"
a=0;//     :cond_9
a=0;//     #v6=(Boolean);v9=(Conflicted);v10=(Reference,Ljava/util/Iterator;);v12=(Boolean);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v12, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;// 
a=0;//     invoke-interface {v12}, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;->dpi()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 186
a=0;//     .local v9, "keyDpi":I
a=0;//     #v9=(Integer);
a=0;//     if-eqz v6, :cond_a
a=0;// 
a=0;//     const/16 v12, 0xd5
a=0;// 
a=0;//     #v12=(PosShort);
a=0;//     if-ne v9, v12, :cond_b
a=0;// 
a=0;//     .line 187
a=0;//     :cond_a
a=0;//     #v12=(Conflicted);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     const/16 v12, 0xd5
a=0;// 
a=0;//     #v12=(PosShort);
a=0;//     if-ne v9, v12, :cond_1
a=0;// 
a=0;//     .line 188
a=0;//     :cond_b
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 195
a=0;//     .end local v6    # "isTvDpi":Z
a=0;//     .end local v9    # "keyDpi":I
a=0;//     .end local v10    # "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/actionbarsherlock/ActionBarSherlock$Implementation;>;"
a=0;//     :cond_c
a=0;//     #v3=(Null);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Reference,Ljava/util/Iterator;);v13=(Boolean);
a=0;//     invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;// 
a=0;//     .line 196
a=0;//     .restart local v7    # "key":Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;//     invoke-interface {v7}, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;->api()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-eq v13, v14, :cond_3
a=0;// 
a=0;//     .line 197
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 198
a=0;//     #v3=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 205
a=0;//     .end local v7    # "key":Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;//     .restart local v0    # "bestApi":I
a=0;//     .restart local v10    # "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/actionbarsherlock/ActionBarSherlock$Implementation;>;"
a=0;//     .restart local v11    # "runtimeApi":I
a=0;//     :cond_d
a=0;//     #v0=(Integer);v3=(Boolean);v7=(Conflicted);v8=(Conflicted);v10=(Reference,Ljava/util/Iterator;);v11=(Integer);v12=(Boolean);v14=(Conflicted);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v12, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;// 
a=0;//     invoke-interface {v12}, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;->api()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 206
a=0;//     .local v8, "keyApi":I
a=0;//     #v8=(Integer);
a=0;//     if-le v8, v11, :cond_e
a=0;// 
a=0;//     .line 207
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 208
a=0;//     :cond_e
a=0;//     if-le v8, v0, :cond_4
a=0;// 
a=0;//     .line 209
a=0;//     move v0, v8
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 213
a=0;//     .end local v8    # "keyApi":I
a=0;//     :cond_f
a=0;//     #v8=(Conflicted);v12=(Boolean);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v12, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;// 
a=0;//     invoke-interface {v12}, Lcom/actionbarsherlock/ActionBarSherlock$Implementation;->api()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-eq v12, v0, :cond_5
a=0;// 
a=0;//     .line 214
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 222
a=0;//     .end local v0    # "bestApi":I
a=0;//     .end local v10    # "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/actionbarsherlock/ActionBarSherlock$Implementation;>;"
a=0;//     .end local v11    # "runtimeApi":I
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(One);
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_11
a=0;// 
a=0;//     .line 223
a=0;//     new-instance v12, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v13, "No implementations match configuration."
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 225
a=0;//     :cond_11
a=0;//     #v12=(Boolean);v13=(One);
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/Collection;);
a=0;//     invoke-interface {v12}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/Class;
a=0;// 
a=0;//     .line 229
a=0;//     .local v4, "impl":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/actionbarsherlock/ActionBarSherlock;>;"
a=0;//     :try_start_0
a=0;//     sget-object v12, Lcom/actionbarsherlock/ActionBarSherlock;->CONSTRUCTOR_ARGS:[Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v4, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 230
a=0;//     .local v1, "ctor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<+Lcom/actionbarsherlock/ActionBarSherlock;>;"
a=0;//     #v1=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     new-array v12, v12, [Ljava/lang/Object;
a=0;// 
a=0;//     #v12=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     aput-object p0, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     invoke-virtual {v1, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     check-cast v12, Lcom/actionbarsherlock/ActionBarSherlock;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4
a=0;// 
a=0;//     return-object v12
a=0;// 
a=0;//     .line 231
a=0;//     .end local v1    # "ctor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<+Lcom/actionbarsherlock/ActionBarSherlock;>;"
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v12=(Conflicted);v13=(Boolean);v14=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 232
a=0;//     .local v2, "e":Ljava/lang/NoSuchMethodException;
a=0;//     #v2=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     new-instance v12, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v12, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 233
a=0;//     .end local v2    # "e":Ljava/lang/NoSuchMethodException;
a=0;//     :catch_1
a=0;//     #v2=(Uninit);v12=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 234
a=0;//     .local v2, "e":Ljava/lang/IllegalArgumentException;
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v12, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v12, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 235
a=0;//     .end local v2    # "e":Ljava/lang/IllegalArgumentException;
a=0;//     :catch_2
a=0;//     #v2=(Uninit);v12=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 236
a=0;//     .local v2, "e":Ljava/lang/InstantiationException;
a=0;//     #v2=(Reference,Ljava/lang/InstantiationException;);
a=0;//     new-instance v12, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v12, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 237
a=0;//     .end local v2    # "e":Ljava/lang/InstantiationException;
a=0;//     :catch_3
a=0;//     #v2=(Uninit);v12=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 238
a=0;//     .local v2, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v2=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     new-instance v12, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v12, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 239
a=0;//     .end local v2    # "e":Ljava/lang/IllegalAccessException;
a=0;//     :catch_4
a=0;//     #v2=(Uninit);v12=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 240
a=0;//     .local v2, "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     #v2=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     new-instance v12, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v12, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v12
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// .end method
a=0;// 
a=0;// .method protected final callbackCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;//     .locals 3
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 556
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 557
a=0;//     .local v1, "result":Z
a=0;//     #v1=(One);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     instance-of v2, v2, Lcom/actionbarsherlock/ActionBarSherlock$OnCreatePanelMenuListener;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 558
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/ActionBarSherlock$OnCreatePanelMenuListener;
a=0;// 
a=0;//     .line 559
a=0;//     .local v0, "listener":Lcom/actionbarsherlock/ActionBarSherlock$OnCreatePanelMenuListener;
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v2, p1}, Lcom/actionbarsherlock/ActionBarSherlock$OnCreatePanelMenuListener;->onCreatePanelMenu(ILcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 566
a=0;//     .end local v0    # "listener":Lcom/actionbarsherlock/ActionBarSherlock$OnCreatePanelMenuListener;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 560
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     instance-of v2, v2, Lcom/actionbarsherlock/ActionBarSherlock$OnCreateOptionsMenuListener;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 561
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/ActionBarSherlock$OnCreateOptionsMenuListener;
a=0;// 
a=0;//     .line 562
a=0;//     .local v0, "listener":Lcom/actionbarsherlock/ActionBarSherlock$OnCreateOptionsMenuListener;
a=0;//     invoke-interface {v0, p1}, Lcom/actionbarsherlock/ActionBarSherlock$OnCreateOptionsMenuListener;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final callbackOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;//     .locals 3
a=0;//     .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 600
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 601
a=0;//     .local v1, "result":Z
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     instance-of v2, v2, Lcom/actionbarsherlock/ActionBarSherlock$OnMenuItemSelectedListener;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 602
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/ActionBarSherlock$OnMenuItemSelectedListener;
a=0;// 
a=0;//     .line 603
a=0;//     .local v0, "listener":Lcom/actionbarsherlock/ActionBarSherlock$OnMenuItemSelectedListener;
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v2, p1}, Lcom/actionbarsherlock/ActionBarSherlock$OnMenuItemSelectedListener;->onMenuItemSelected(ILcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 610
a=0;//     .end local v0    # "listener":Lcom/actionbarsherlock/ActionBarSherlock$OnMenuItemSelectedListener;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 604
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     instance-of v2, v2, Lcom/actionbarsherlock/ActionBarSherlock$OnOptionsItemSelectedListener;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 605
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/ActionBarSherlock$OnOptionsItemSelectedListener;
a=0;// 
a=0;//     .line 606
a=0;//     .local v0, "listener":Lcom/actionbarsherlock/ActionBarSherlock$OnOptionsItemSelectedListener;
a=0;//     invoke-interface {v0, p1}, Lcom/actionbarsherlock/ActionBarSherlock$OnOptionsItemSelectedListener;->onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final callbackPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;//     .locals 4
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 577
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 578
a=0;//     .local v1, "result":Z
a=0;//     #v1=(One);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     instance-of v2, v2, Lcom/actionbarsherlock/ActionBarSherlock$OnPreparePanelListener;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 579
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/ActionBarSherlock$OnPreparePanelListener;
a=0;// 
a=0;//     .line 580
a=0;//     .local v0, "listener":Lcom/actionbarsherlock/ActionBarSherlock$OnPreparePanelListener;
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v0, v2, v3, p1}, Lcom/actionbarsherlock/ActionBarSherlock$OnPreparePanelListener;->onPreparePanel(ILandroid/view/View;Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 587
a=0;//     .end local v0    # "listener":Lcom/actionbarsherlock/ActionBarSherlock$OnPreparePanelListener;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Boolean);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 581
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     instance-of v2, v2, Lcom/actionbarsherlock/ActionBarSherlock$OnPrepareOptionsMenuListener;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 582
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/ActionBarSherlock$OnPrepareOptionsMenuListener;
a=0;// 
a=0;//     .line 583
a=0;//     .local v0, "listener":Lcom/actionbarsherlock/ActionBarSherlock$OnPrepareOptionsMenuListener;
a=0;//     invoke-interface {v0, p1}, Lcom/actionbarsherlock/ActionBarSherlock$OnPrepareOptionsMenuListener;->onPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchCloseOptionsMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 376
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 0
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract dispatchCreateOptionsMenu(Landroid/view/Menu;)Z
a=0;// .end method
a=0;// 
a=0;// .method public dispatchDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 538
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract dispatchInvalidateOptionsMenu()V
a=0;// .end method
a=0;// 
a=0;// .method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchMenuOpened(ILandroid/view/Menu;)Z
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 506
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchOpenOptionsMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 356
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract dispatchOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPanelClosed(ILandroid/view/Menu;)V
a=0;//     .locals 0
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 524
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPause()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPostCreate(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 397
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPostResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract dispatchPrepareOptionsMenu(Landroid/view/Menu;)Z
a=0;// .end method
a=0;// 
a=0;// .method public dispatchRestoreInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 542
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "outState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 540
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchStop()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 331
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchTitleChanged(Ljava/lang/CharSequence;I)V
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "color"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 415
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract getActionBar()Lcom/actionbarsherlock/app/ActionBar;
a=0;// .end method
a=0;// 
a=0;// .method public getMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 773
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mMenuInflater:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 774
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/ActionBarSherlock;->getActionBar()Lcom/actionbarsherlock/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 775
a=0;//     new-instance v0, Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/ActionBarSherlock;->getThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/actionbarsherlock/view/MenuInflater;-><init>(Landroid/content/Context;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mMenuInflater:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     .line 780
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mMenuInflater:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 777
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v1}, Lcom/actionbarsherlock/view/MenuInflater;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mMenuInflater:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract getThemedContext()Landroid/content/Context;
a=0;// .end method
a=0;// 
a=0;// .method public abstract hasFeature(I)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract requestFeature(I)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract setContentView(I)V
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 671
a=0;//     #v1=(Byte);
a=0;//     new-instance v0, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/actionbarsherlock/ActionBarSherlock;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 672
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setProgress(I)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setProgressBarIndeterminate(Z)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setProgressBarIndeterminateVisibility(Z)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setProgressBarVisibility(Z)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setSecondaryProgress(I)V
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 703
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/ActionBarSherlock;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/ActionBarSherlock;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 704
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract setTitle(Ljava/lang/CharSequence;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setUiOptions(I)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setUiOptions(II)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract startActionMode(Lcom/actionbarsherlock/view/ActionMode$Callback;)Lcom/actionbarsherlock/view/ActionMode;
a=0;// .end method
}}
