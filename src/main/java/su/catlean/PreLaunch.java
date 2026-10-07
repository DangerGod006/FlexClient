package su.catlean;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import kotlin.Metadata;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.apache.commons.lang3.SystemUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreLaunch.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/PreLaunch.class */
@ExcludeCommon
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsu/catlean/PreLaunch;", "Lnet/fabricmc/loader/api/entrypoint/PreLaunchEntrypoint;", "PreLaunch", "()V", "", "L", "onPreLaunch", "Ljavax/swing/JFrame;", "G", "Ljavax/swing/JFrame;", "catlean"})
public final class PreLaunch implements PreLaunchEntrypoint {

    @NotNull
    public static final PreLaunch INSTANCE = null;

    @Nullable
    private static JFrame G;
    private static final long a = 0;
    private static final String b = null;
    private static final long c = 0;

    private PreLaunch() {
    }

    public final void L() {
        JFrame jFrame;
        try {
            jFrame = G;
            if (jFrame != null) {
                jFrame.setVisible(false);
            }
        } catch (NumberFormatException unused) {
            throw a((NumberFormatException) jFrame);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, java.lang.NumberFormatException] */
    public void onPreLaunch() {
        ?? r0;
        try {
            r0 = SystemUtils.IS_OS_WINDOWS;
            if (r0 == 0) {
                return;
            }
            SwingUtilities.invokeLater(PreLaunch::u);
        } catch (NumberFormatException unused) {
            throw a((NumberFormatException) r0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.NumberFormatException] */
    /* JADX WARN: Type inference failed for: r0v11, types: [javax.swing.JFrame] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean, java.lang.NumberFormatException] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.NumberFormatException] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NumberFormatException] */
    private static final void D(ActionEvent actionEvent) {
        ?? A;
        ?? r0;
        try {
            try {
                JFrame jFrame = G;
                if (jFrame != null) {
                    A = jFrame.isVisible();
                    r0 = A == 1 ? 1 : 0;
                } else {
                    r0 = 0;
                }
                if (r0 != 0) {
                    try {
                        try {
                            r0 = G;
                            if (r0 != 0) {
                                r0.repaint();
                            }
                        } catch (NumberFormatException unused) {
                            throw a((NumberFormatException) r0);
                        }
                    } catch (NumberFormatException unused2) {
                        throw a((NumberFormatException) r0);
                    }
                }
            } catch (NumberFormatException unused3) {
                A = a((NumberFormatException) A);
                throw A;
            }
        } catch (NumberFormatException unused4) {
            throw a((NumberFormatException) A);
        }
    }

    private static final void u() {
        long j = a ^ 113090094899193L;
        PreLaunch preLaunch = INSTANCE;
        JFrame jFrame = new JFrame(b);
        jFrame.setDefaultCloseOperation(2);
        jFrame.getContentPane().add(LoadingPanel.INSTANCE);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setLayout(new GridLayout());
        jFrame.setLocationRelativeTo((Component) null);
        G = jFrame;
        Timer timer = new Timer((int) c, PreLaunch::D);
        timer.setRepeats(true);
        timer.start();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String a(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i2 = 0;
        while (i2 < length) {
            int i3 = 255 & bArr[i2];
            if (i3 < 192) {
                int i4 = i;
                i++;
                cArr[i4] = (char) i3;
            } else if (i3 < 224) {
                i2++;
                int i5 = i;
                i++;
                cArr[i5] = (char) (((char) (((char) (i3 & 31)) << 6)) | ((char) (bArr[i2] & 63)));
            } else if (i2 < length - 2) {
                int i6 = i2 + 1;
                char c2 = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c2 | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }
}
