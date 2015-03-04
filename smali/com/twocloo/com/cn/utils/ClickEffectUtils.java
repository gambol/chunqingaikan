package com.twocloo.com.cn.utils; class ClickEffectUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/ClickEffectUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ClickEffectUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static ButtonTouchDark:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// .field public static ImageButtonTouchDark:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// .field public static ImageTouchDark:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// .field public static LinearTouchDark:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// .field public static RelativeTouchDark:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/ClickEffectUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getButtonListener(Landroid/app/Activity;)Landroid/view/View$OnTouchListener;
a=0;//     .locals 1
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     new-instance v0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/utils/ClickEffectUtils$3;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/utils/ClickEffectUtils$3;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/utils/ClickEffectUtils$3;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/utils/ClickEffectUtils;->ButtonTouchDark:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getImageButtonListener(Landroid/app/Activity;)Landroid/view/View$OnTouchListener;
a=0;//     .locals 1
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     new-instance v0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/utils/ClickEffectUtils;->ImageButtonTouchDark:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getImageViewListener(Landroid/app/Activity;)Landroid/view/View$OnTouchListener;
a=0;//     .locals 1
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     new-instance v0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/utils/ClickEffectUtils$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/utils/ClickEffectUtils$1;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/utils/ClickEffectUtils$1;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/utils/ClickEffectUtils;->ImageTouchDark:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getPath()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "mounted"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 190
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 191
a=0;//     .local v0, "root_path":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/hyatt"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 192
a=0;//     .local v1, "temp":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 195
a=0;//     :cond_0
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/hyatt/pic"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 196
a=0;//     .local v2, "temppic":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 197
a=0;//     invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 199
a=0;//     :cond_1
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 201
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// 
a=0;//     .end local v0    # "root_path":Ljava/lang/String;
a=0;//     .end local v1    # "temp":Ljava/io/File;
a=0;//     .end local v2    # "temppic":Ljava/io/File;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getRelativeListener()Landroid/view/View$OnTouchListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     new-instance v0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/utils/ClickEffectUtils$4;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/utils/ClickEffectUtils$4;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/utils/ClickEffectUtils$4;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/utils/ClickEffectUtils;->RelativeTouchDark:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static savePicPath(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .param p0, "bmp"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "mounted"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 166
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 167
a=0;//     .local v2, "root_path":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "/hyatt"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 168
a=0;//     .local v3, "temp":Ljava/io/File;
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "/hyatt/pic"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 172
a=0;//     .local v4, "temppic":Ljava/io/File;
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 175
a=0;//     :cond_1
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "/hyatt/pic"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v0, v5, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 177
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 178
a=0;//     .local v1, "fos":Ljava/io/FileOutputStream;
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v6, 0x50
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {p0, v5, v6, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 179
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 184
a=0;//     .end local v0    # "file":Ljava/io/File;
a=0;//     .end local v1    # "fos":Ljava/io/FileOutputStream;
a=0;//     .end local v2    # "root_path":Ljava/lang/String;
a=0;//     .end local v3    # "temp":Ljava/io/File;
a=0;//     .end local v4    # "temppic":Ljava/io/File;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 180
a=0;//     .restart local v0    # "file":Ljava/io/File;
a=0;//     .restart local v2    # "root_path":Ljava/lang/String;
a=0;//     .restart local v3    # "temp":Ljava/io/File;
a=0;//     .restart local v4    # "temppic":Ljava/io/File;
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/io/File;);v4=(Reference,Ljava/io/File;);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 184
a=0;//     .end local v0    # "file":Ljava/io/File;
a=0;//     .end local v2    # "root_path":Ljava/lang/String;
a=0;//     .end local v3    # "temp":Ljava/io/File;
a=0;//     .end local v4    # "temppic":Ljava/io/File;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
